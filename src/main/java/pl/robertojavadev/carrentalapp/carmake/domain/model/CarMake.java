package pl.robertojavadev.carrentalapp.carmake.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "car_make")
public class CarMake {

    @Id
    private UUID id;

    private String name;

    public CarMake(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public CarMake() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarMake{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
