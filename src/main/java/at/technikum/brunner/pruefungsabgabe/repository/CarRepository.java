package at.technikum.brunner.pruefungsabgabe.repository;

import at.technikum.brunner.pruefungsabgabe.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
