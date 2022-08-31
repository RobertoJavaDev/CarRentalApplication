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
    List<Car> getCars(@PathVariable ("{car-make-id}") UUID carMakeId){
        return carService.getCars(carMakeId);
    }

    @GetMapping("{car-id}")
    public Car getCar(@PathVariable ("{car-make-id}") UUID carMakeId, @PathVariable ("{car-id}") UUID carId){
        return carService.getCar(carId);
    }

    @PostMapping
    public Car createCar(@PathVariable ("{car-make-id}") UUID carMakeId, @RequestBody Car car){
        return carService.createCar(carMakeId, car);
    }

    @PutMapping("{car-id}")
    public Car updateCar(@PathVariable ("{car-make-id}") UUID carMakeId,
                         @PathVariable ("{car-id}") UUID carId,
                         @RequestBody Car car){
        return carService.updateCar(carId,car);
    }

    @DeleteMapping("{car-id}")
    public void deleteCar(@PathVariable ("{car-id}") UUID carId){
        carService.deleteCar(carId);
    }
}
