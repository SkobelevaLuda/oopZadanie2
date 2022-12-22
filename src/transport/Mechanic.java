package transport;

import java.util.Objects;

public class Mechanic<T extends Transport> {
    private String mechanicName;
    private String companyName;
    private String typeToCar;

    public Mechanic() {
        this.mechanicName = mechanicName;
        this.companyName = companyName;
        this.typeToCar = typeToCar;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getTypeToCar() {
        return typeToCar;
    }

    public void setTypeToCar(String typeToCar) {
        this.typeToCar = typeToCar;
    }

    public boolean maintenance(T t) {
        return t.passDiagnostics();

    }

    public void repair(T t) {
        t.repair();


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return getMechanicName().equals(mechanic.getMechanicName()) && getCompanyName().equals(mechanic.getCompanyName()) && getTypeToCar().equals(mechanic.getTypeToCar());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMechanicName(), getCompanyName(), getTypeToCar());
    }
}
