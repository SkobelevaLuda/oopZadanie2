package transport;

public class DriverC extends Driver<Truck>{

    public DriverC(String surname, boolean drivingLicense, int experience) {
        super(surname, drivingLicense, experience);
    }

    @Override
    public void startMoving(Truck transport) {
        transport.startMoving();
    }

    @Override
    public void finishOfMoving(Truck transport) {
        transport.finishOfMoving();

    }


    @Override
    public void refuei(Truck transport) {
        System.out.println(" Водитель "+getSurname()+" заправляет "+transport.getBrand());

    }
}
