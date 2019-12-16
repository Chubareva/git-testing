package by.bsu.model;
import java.util.Objects;
public class Vaucher {

    private String name;
    private   String surname;
    private String vaucherNumber;

    public Vaucher(String name,String surname,String vaucherNumber) {
        this.name=name;
        this.surname=surname;
        this.vaucherNumber=vaucherNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getVaucherNumber() {
        return vaucherNumber;
    }

    public void setVaucherNumber(String vaucherNumber) {
        this.vaucherNumber = vaucherNumber;
    }

    @Override
    public String toString() {
        return "Vaucher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", vaucherNumber='" + vaucherNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vaucher)) return false;
        Vaucher vaucher = (Vaucher) o;
        return Objects.equals(getName(), vaucher.getName()) &&
                Objects.equals(getVaucherNumber(), vaucher.getVaucherNumber()) &&
                Objects.equals(getSurname(), vaucher.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(),getVaucherNumber());
    }
}


