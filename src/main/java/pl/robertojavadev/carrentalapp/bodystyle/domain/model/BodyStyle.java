package pl.robertojavadev.carrentalapp.bodystyle.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "body_styles")
public class BodyStyle {

    @Id
    private UUID id;

    private String name;

    public BodyStyle() {
        this.id = UUID.randomUUID();
    }

    public BodyStyle(UUID id, String name) {
        this.id = UUID.randomUUID();
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
        return "BodyStyle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
