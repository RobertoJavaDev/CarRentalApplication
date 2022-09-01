package pl.robertojavadev.carrentalapp.carmake.domain.model;

import pl.robertojavadev.carrentalapp.bodystyle.domain.model.BodyStyle;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "car_make")
public class CarMake {

    @Id
    private UUID id;
    private String name;

    @ManyToOne
    private BodyStyle bodyStyle;

    @OneToMany
    private Set<Car> cars;

    public CarMake() {
        this.id = UUID.randomUUID();
    }

    public CarMake addCar(Car car) {
        if (cars == null){
            cars = new LinkedHashSet<>();
        }
        car.setCarMake(this);
        cars.add(car);
        return this;
    }

    public CarMake(UUID id, String name) {
        this();
        this.name = name;
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
