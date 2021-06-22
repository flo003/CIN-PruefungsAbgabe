package at.technikum.brunner.pruefungsabgabe.resources;

import at.technikum.brunner.pruefungsabgabe.model.Car;
import at.technikum.brunner.pruefungsabgabe.repository.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarResources {

    private final CarRepository carRepository;

    public CarResources(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping
    public List<Car> getAllCars(){
        return carRepository.findAll();
    }
}
