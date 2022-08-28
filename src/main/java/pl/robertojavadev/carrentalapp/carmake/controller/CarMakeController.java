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
        return null;
    }

    @GetMapping("{id}")
    public CarMake getCarMake(@PathVariable UUID id){
        return null;
    }

    @PostMapping
    public CarMake createCarMake(@RequestBody CarMake carMake){
        return null;
    }

    @PutMapping("{id}")
    public CarMake updateCarMake(@PathVariable UUID id, @RequestBody CarMake carMake){
        return null;
    }

    @DeleteMapping("{id}")
    public void deleteCarMake(@PathVariable UUID id){
    }
}
