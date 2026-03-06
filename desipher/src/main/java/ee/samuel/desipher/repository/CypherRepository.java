package ee.samuel.desipher.repository;

import ee.samuel.desipher.entity.Cypher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CypherRepository extends JpaRepository <Cypher, Long> {
}
