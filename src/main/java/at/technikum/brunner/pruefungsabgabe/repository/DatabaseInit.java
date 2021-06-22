package at.technikum.brunner.pruefungsabgabe.repository;

import at.technikum.brunner.pruefungsabgabe.model.Car;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DatabaseInit {

    private final CarRepository carRepository;

    public DatabaseInit(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationReady(){
        carRepository.saveAll(
                List.of(
                    new Car(null, "BlueCars","blue11",2000),
                    new Car(null, "RedCars","red09",1998)
                ));

    }
}
