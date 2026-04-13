package ee.samuel.cars.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    private String brand;
    private String model;
    private Long year;
    private String color;
    private Long price;
}

