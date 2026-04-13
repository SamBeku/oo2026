package ee.samuel.cars.repository;

import ee.samuel.cars.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    Long id(Long id);
}
