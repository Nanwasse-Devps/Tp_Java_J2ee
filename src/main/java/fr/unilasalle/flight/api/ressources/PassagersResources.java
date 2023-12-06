package fr.unilasalle.flight.api.ressources;

import fr.unilasalle.flight.api.beans.Passagers;
import fr.unilasalle.flight.api.repositories.PassagersRepository;
import jakarta.inject.Inject;
import jakarta.persistence.PersistenceException;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/passengers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PassagersResources extends GenericRessource {

    @Inject
    private PassagersRepository repository;
    @GET
    public Response getAllPassengers() {
        List<Passagers> passengers = repository.listAll();
        return Response.ok(passengers).build();
    }
    @GET
    @Path("/{id}")
    public Response getPassengerById(@PathParam("id") Long id) {
        var passenger = repository.findByIdOptional(id).orElse(null);
        return getOr404(passenger);
    }
    @POST
    @Transactional
    public Response createPassenger(Passagers passenger) {
        try {
            repository.persistAndFlush(passenger);
            return Response.status(201).build();
        } catch (PersistenceException e) {
            return Response.serverError()
                    .entity(new ErrorWrapper(e.getMessage()))
                    .build();
        }
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response updatePassenger(@PathParam("id") Long id, Passagers updatedPassenger) {
        Passagers existingPassenger = repository.findByIdOptional(id).orElse(null);
        if (existingPassenger == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        existingPassenger.setId(updatedPassenger.getId());
        existingPassenger.setEmail(updatedPassenger.getEmail());
        existingPassenger.setFirstname(updatedPassenger.getFirstname());
        existingPassenger.setSurname(updatedPassenger.getSurname());
        existingPassenger.setReservations(updatedPassenger.getReservations());
        try {
            repository.persistAndFlush(existingPassenger);
            return Response.ok(existingPassenger).build();
        } catch (PersistenceException e) {
            return Response.serverError()
                    .entity(new ErrorWrapper(e.getMessage()))
                    .build();
        }
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deletePassenger(@PathParam("id") Long id) {
        Passagers existingPassenger = repository.findByIdOptional(id).orElse(null);
        if (existingPassenger == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        try {
            repository.delete(existingPassenger);
            return Response.noContent().build();
        } catch (PersistenceException e) {
            return Response.serverError()
                    .entity(new ErrorWrapper(e.getMessage()))
                    .build();
        }
    }

}
