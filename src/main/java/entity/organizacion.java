package entity;

import javax.lang.model.element.Name;
import javax.persistence.*;

@Entity
@Table(name = "organizacion")
public class organizacion {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "Name")
    private String Name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "organizacion{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
