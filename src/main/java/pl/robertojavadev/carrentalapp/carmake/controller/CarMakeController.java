package pl.robertojavadev.carrentalapp.carmake.controller;

import org.springframework.web.bind.annotation.*;
import pl.robertojavadev.carrentalapp.carmake.domain.model.CarMake;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/car-makes")
public class CarMakeController {

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
