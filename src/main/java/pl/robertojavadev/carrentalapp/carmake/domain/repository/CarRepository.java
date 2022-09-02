package pl.robertojavadev.carrentalapp.carmake.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.robertojavadev.carrentalapp.carmake.domain.model.Car;

import java.util.List;
import java.util.UUID;

@Repository
public interface CarRepository extends JpaRepository <Car, UUID> {
    List<Car> findByCarMakeId(UUID carMakeId);
}
