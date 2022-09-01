package pl.robertojavadev.carrentalapp.carmake.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.robertojavadev.carrentalapp.carmake.domain.model.Car;
import pl.robertojavadev.carrentalapp.carmake.domain.model.CarMake;
import pl.robertojavadev.carrentalapp.carmake.domain.repository.CarMakeRepository;
import pl.robertojavadev.carrentalapp.carmake.domain.repository.CarRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CarService {

    private final CarRepository carRepository;
    private final CarMakeRepository carMakeRepository;

    public CarService(CarRepository carRepository, CarMakeRepository carMakeRepository) {
        this.carRepository = carRepository;
        this.carMakeRepository = carMakeRepository;
    }

    @Transactional(readOnly = true)
    public List<Car> getCars(UUID carMakeId) {
        return carRepository.findByCarMakeId(carMakeId);
    }

    @Transactional(readOnly = true)
    public Optional<Car> getCar(UUID carId) {
        return carRepository.findById(carId);
    }

    @Transactional
    public Car createCar(UUID carMakeId, Car carRequest) {
        Car car = new Car();
        car.setName(carRequest.getName());
        CarMake carMake = carMakeRepository.getById(carMakeId);
        carMake.addCar(car);

        carRepository.save(car);
        carMakeRepository.save(carMake);

        return car;
    }

    @Transactional
    public Car updateCar(UUID carId, Car carRequest) {
        Car car = carRepository.getById(carId);
        car.setName(carRequest.getName());
        return carRepository.save(car);
    }

    @Transactional
    public void deleteCar(UUID carId) {
        carRepository.deleteById(carId);
    }
}
