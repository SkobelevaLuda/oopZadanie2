package transport;

import java.util.LinkedList;
import java.util.Queue;


public class ServiceStation<T extends Transport> {

    private final String stantionName;
    private final String specialison;

    private final Queue<T> queue = new LinkedList<>();

    public ServiceStation(String stantionName, String specialison) {
        this.stantionName = stantionName;
        this.specialison = specialison;
    }

    private void addToQueuq(T transport) {
        queue.offer(transport);
    }

    public void addCar(Car car) {
        addToQueuq((T) car);
    }

    public void addTruk(Truck truck) {
        addToQueuq((T) truck);
    }


    public void performDiagnostics() {
        T transport = queue.poll();
        boolean result = transport.passDiagnostics();
        if (!result) {
            transport.repair();
        }
        if (transport != null) {
            System.out.println("Механник" + transport.getMechanics() + "проверяет машину " + transport.getBrand() +
                    " " + transport.getModel());
        }
    }

}

