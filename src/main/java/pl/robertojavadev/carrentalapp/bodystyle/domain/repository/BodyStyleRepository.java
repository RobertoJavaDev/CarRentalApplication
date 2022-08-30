package pl.robertojavadev.carrentalapp.bodystyle.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.robertojavadev.carrentalapp.bodystyle.domain.model.BodyStyle;

import java.util.UUID;

@Repository
public interface BodyStyleRepository extends JpaRepository <BodyStyle, UUID> {
}
