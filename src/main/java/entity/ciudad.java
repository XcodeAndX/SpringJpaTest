package entity;

import javax.persistence.*;

@Entity
@Table (name = "ciudad")
public class ciudad {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "Name", length = 15)
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
        return "ciudad{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
