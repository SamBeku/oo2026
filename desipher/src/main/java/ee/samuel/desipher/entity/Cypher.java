package ee.samuel.desipher.entity;

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
@Table(name = "cypher")
public class Cypher {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    private String word;


}
