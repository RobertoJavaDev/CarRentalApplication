package pl.robertojavadev.carrentalapp.carmake.controller;

import org.springframework.web.bind.annotation.*;
import pl.robertojavadev.carrentalapp.carmake.domain.model.CarMake;
import pl.robertojavadev.carrentalapp.carmake.service.CarMakeService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/car-makes")
public class CarMakeController {

    private final CarMakeService carMakeService;

    public CarMakeController(CarMakeService carMakeService) {
        this.carMakeService = carMakeService;
    }

    @GetMapping
    public List<CarMake> getCarMakes(){
        return carMakeService.getCarMakes();
    }

    @GetMapping("{id}")
    public CarMake getCarMake(@PathVariable UUID id){
        return carMakeService.getCarMake(id);
    }

    @PostMapping
    public CarMake createCarMake(@RequestBody CarMake carMake){
        return carMakeService.createCarMake(carMake);
    }

    @PutMapping("{id}")
    public CarMake updateCarMake(@PathVariable UUID id, @RequestBody CarMake carMake){
        return carMakeService.updateCarMake(id, carMake);
    }

    @DeleteMapping("{id}")
    public void deleteCarMake(@PathVariable UUID id){
        carMakeService.deleteCarMake(id);
    }
}
