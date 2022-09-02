package pl.robertojavadev.carrentalapp.carmake.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    private UUID id;
    private String name;
    private String engineCapacity;
    private String price;

    @ManyToOne
    private CarMake carMake;

    public Car() {
        this.id=UUID.randomUUID();
    }

    public CarMake getCarMake() {
        return carMake;
    }

    public void setCarMake(CarMake carMake) {
        this.carMake = carMake;
    }

    public Car(UUID id, String name, String engineCapacity, String price) {
        this();
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.price = price;
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

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engineCapacity='" + engineCapacity + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
