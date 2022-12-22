package transport;

public class DriverD extends Driver<Bus>{
    public DriverD(String surname, boolean drivingLicense, int experience) {
        super(surname, drivingLicense, experience);
    }

    @Override
    public void startMoving(Bus transport) {
        transport.startMoving();
    }

    @Override
    public void finishOfMoving(Bus transport) {
        transport.finishOfMoving();

    }
    @Override
    public void refuei(Bus transport) {
        System.out.println(" Водитель "+getSurname()+" заправляет "+transport.getBrand());
    }
}
