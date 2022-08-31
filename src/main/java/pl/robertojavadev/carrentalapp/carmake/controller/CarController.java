package pl.robertojavadev.carrentalapp.carmake.controller;

import org.springframework.web.bind.annotation.*;
import pl.robertojavadev.carrentalapp.carmake.domain.model.Car;
import pl.robertojavadev.carrentalapp.carmake.service.CarService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/car-makes/{car-make-id}/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    List<Car> getCars(){
        return null;
    }

    @GetMapping("{id}")
    public Car getCar(@PathVariable UUID id){
        return null;
    }

    @PostMapping
    public Car createCar(@RequestBody Car car){
        return null;
    }

    @PutMapping("{id}")
    public Car updateCar(@PathVariable UUID id, @RequestBody Car carRequest){
        return null;
    }

    @DeleteMapping("{id}")
    public void deleteCar(@PathVariable UUID id){
    }
}
