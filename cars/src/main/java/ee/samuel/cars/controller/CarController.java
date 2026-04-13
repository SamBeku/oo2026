package ee.samuel.cars.controller;

import ee.samuel.cars.entity.Car;
import ee.samuel.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping("car")
    public List<Car> getCars(){
        return carRepository.findAll();
    }
    @GetMapping("car/{id}")
    public List<Car> deleteCar(@PathVariable Long id){
       carRepository.deleteById(id);
        return carRepository.findAll();
    }

    @PostMapping("addcar")
    public List<Car> addCars(@RequestBody Car car) {
        carRepository.save(car);
        return carRepository.findAll();
    }
}