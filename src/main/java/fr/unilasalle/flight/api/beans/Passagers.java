package beans;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "passengers")
public class Passagers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false, unique = true)
    private String email;

    // Constructeur avec tous les champs
    public Passagers(String surname, String firstname, String email) {
        this.surname = surname;
        this.firstname = firstname;
        this.email = email;
    }

    // Getters et setters (générés par Lombok)
}
