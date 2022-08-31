package pl.robertojavadev.carrentalapp.carmake.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
import pl.robertojavadev.carrentalapp.carmake.domain.model.CarMake;

import java.util.UUID;

@RestController
public interface CarMakeRepository extends JpaRepository <CarMake, UUID> {
}
