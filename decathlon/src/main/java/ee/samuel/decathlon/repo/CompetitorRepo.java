package ee.samuel.decathlon.repo;

import ee.samuel.decathlon.entity.Competitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitorRepo extends JpaRepository<Competitor, Long> {
}
