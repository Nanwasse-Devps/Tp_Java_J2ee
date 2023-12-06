package fr.unilasalle.flight.api.repositories;

import fr.unilasalle.flight.api.beans.Passagers;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.inject.Model;

import java.util.List;

@Model
public class PassagersRepository implements PanacheRepositoryBase<Passagers, Long> {

    public void deleteAllPassagers() {
        deleteAll();
    }

    public List<Passagers> findBySurname(String surname) {
        return find("surname", surname).list();
    }

    public List<Passagers> findByFirstname(String firstname) {
        return find("firstname", firstname).list();
    }

    public Passagers findByEmail(String email) {
        return find("email", email).firstResult();
    }

    // Ajoutez d'autres méthodes CRUD au besoin
}
