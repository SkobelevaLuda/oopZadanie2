package transport;

public class DriverB extends Driver<Car> {

    public DriverB(String surname, boolean drivingLicense, int experience) {
        super(surname, drivingLicense, experience);
    }

    @Override
    public void startMoving(Car transport) {
        transport.startMoving();
    }

    @Override
    public void finishOfMoving(Car transport) {
        transport.finishOfMoving();
    }


    @Override
    public void refuei(Car transport) {
        System.out.println(" Водитель " + getSurname() + " заправляет " + transport.getBrand());
    }

}
