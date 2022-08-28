package pl.robertojavadev.carrentalapp.bodystyle.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "body_styles")
public class BodyStyle {

    @Id
    private UUID id;

    private String name;

    public BodyStyle() {
    }

    public BodyStyle(UUID id, String name) {
        this.id = id;
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
