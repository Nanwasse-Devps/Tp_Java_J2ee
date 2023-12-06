package beans;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "reservations")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "flight_id", nullable = false)
    private Integer flightId;

    @Column(name = "passenger_id", nullable = false)
    private Integer passengerId;

    public Reservations(Integer flightId, Integer passengerId) {
        this.flightId = flightId;
        this.passengerId = passengerId;
    }

    // Getters et setters doive être générés par Lombok
}
