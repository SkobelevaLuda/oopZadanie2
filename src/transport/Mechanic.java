package transport;

public class Mechanic <T extends Transport> {
    private final String mechanicName;
    private final String companyName;
    private String typeToCar;

    public Mechanic(String mechanicName, String companyName, String typeToCar) {
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
    public boolean maintenance(T t){
        return t.passDiagnostics();

    }
    public void repair(T t){
        t.repair();

    }

}
