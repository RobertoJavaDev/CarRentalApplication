package pl.robertojavadev.carrentalapp.carmake.service;

import org.springframework.stereotype.Service;
import pl.robertojavadev.carrentalapp.carmake.domain.model.CarMake;
import pl.robertojavadev.carrentalapp.carmake.domain.repository.CarMakeRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CarMakeService {

    private final CarMakeRepository carMakeRepository;

    public CarMakeService(CarMakeRepository carMakeRepository) {
        this.carMakeRepository = carMakeRepository;
    }

    public List<CarMake> getCarMakes(){
        return carMakeRepository.findAll();
    }

    public Optional<CarMake> getCarMake(UUID id){
        return carMakeRepository.findById(id);
    }

    public CarMake createCarMake(CarMake carMakeRequest){
        CarMake carMake = new CarMake();
        carMake.setName(carMakeRequest.getName());
        return carMakeRepository.save(carMake);
    }

    public CarMake updateCarMake(UUID id, CarMake carMakeRequest){
        CarMake carMake = carMakeRepository.getById(id);
        carMake.setName(carMakeRequest.getName());
        return carMakeRepository.save(carMake);
    }

    public void deleteCarMake(UUID id){
        carMakeRepository.deleteById(id);
    }
}
