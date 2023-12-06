package beans;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table ( name="planes")
public class Avion {
    @Id
    @SequenceGenerator( name ="planeSequence", sequenceName = "planeSequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "planeSequence")

    private long id;
    @Column (nullable = false)
    private String operator;
    @Column (nullable = false)
    private String model;
    @Column (nullable = false)
    private String registration;
    @Column (nullable = false)
    private Integer capacity;
}
