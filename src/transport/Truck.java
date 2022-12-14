package transport;

public class Truck extends Transport implements Competing {
    private double engineVolume;

    public static final int BEST_TIME= 22;
    public static final int MAX_SPEED= 44;

    public Truck(String brand, String country, double fuelPercentage, double engineVolume) {
        super(brand, country);
        this.engineVolume = engineVolume;
    }
    public Truck(String brand,
               String model,
               double engineVolume) {
        super(brand, model);
        {
            if (engineVolume == 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public void startMoving() {
        System.out.println("Начать движение!");
    }

    @Override
    public void finishOfMoving() {
        System.out.println(" Закончить движение!");
    }

    @Override
    public void pitStop() {
        System.out.println( "Грузовик прошел Пит Стоп");

    }

    @Override
    public int BestTime() {
        return BEST_TIME;
    }

    @Override
    public int MaxSpeed() {
        return MAX_SPEED;
    }
}
