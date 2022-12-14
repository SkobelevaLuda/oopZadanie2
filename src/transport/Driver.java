package transport;

public abstract class Driver<D extends Transport> {
    private String surname;
    private boolean drivingLicense;
    private int experience;

    public Driver(String surname, boolean drivingLicense, int experience) {
        this.surname = surname;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
    }

    public abstract void startMoving(D transport);
    public abstract void finishOfMoving(D transport);
    public abstract void refuei(D transport);

    public void printInformation(D transport){
        System.out.println("Водитель "+surname+ " управляет автомобилем " + transport.getBrand()+ " и будет " +
                "участвовать в заезде");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

}
