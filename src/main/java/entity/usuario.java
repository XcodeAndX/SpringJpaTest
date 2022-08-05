package entity;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class usuario {

    @Id
    @GeneratedValue
    public int id;

    @Column(name = "Name")
    public String Name;

    @Column(name = "lastName")
    public String lastName;

    @Column(name = "email")
    public String email;

    @Column(name = "cedula")
    public String cedula;


    @Column(name = "fkciudad")
    @JoinColumn(foreignKey = @ForeignKey(name = "FK_USER"))

    public int fkciudad;

    @Column(name = "fkorganizacion")
    public int fkorganizacion;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getFkciudad() {
        return fkciudad;
    }

    public void setFkciudad(int fkciudad) {
        this.fkciudad = fkciudad;
    }

    public int getFkorganizacion() {
        return fkorganizacion;
    }

    public void setFkorganizacion(int fkorganizacion) {
        this.fkorganizacion = fkorganizacion;
    }

    @Override
    public String toString() {
        return "usuario{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", cedula='" + cedula + '\'' +
                ", fkciudad=" + fkciudad +
                ", fkorganizacion=" + fkorganizacion +
                '}';
    }
}
