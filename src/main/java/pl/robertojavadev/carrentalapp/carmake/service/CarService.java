package pl.robertojavadev.carrentalapp.carmake.service;

import org.springframework.stereotype.Service;
import pl.robertojavadev.carrentalapp.carmake.domain.model.Car;

import java.util.List;
import java.util.UUID;

@Service
public class CarService {
    public List<Car> getCars(UUID carMakeId) {
        return null;
    }

    public Car getCar(UUID carId) {
        return null;
    }

    public Car createCar(UUID carMakeId, Car car) {
        return null;
    }

    public Car updateCar(UUID carId, Car car) {
        return null;
    }

    public void deleteCar(UUID carId) {

    }
}
