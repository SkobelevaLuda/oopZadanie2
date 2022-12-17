package transport;

public class Bus extends Transport implements Competing {
    private Capasity capasity;
    private double engineVolume;

    public static final int BEST_TIME = 40;
    public static final int MAX_SPEED = 60;

    public Bus(String brand, String country, Capasity capasity, boolean diagnostic) {
        super(brand, country, diagnostic);
        this.capasity = capasity;
    }

    public Bus(String brand, int year, String country, int maxSpeed, double fuelPercentage, double engineVolume,
               Capasity capasity, boolean diagnostic) {
        super(brand, country,diagnostic);
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public Bus(String brand,
               String model,
               double engineVolume, Capasity capasity, boolean diagnostic) {
        super(brand, model,diagnostic);
        this.capasity = capasity;
        {
            if (engineVolume == 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
        }

       /* if (maxSpeed<=0){
            this.maxSpeed=Math.abs(maxSpeed);
        }else {
            this.maxSpeed = maxSpeed;
        }

    }


    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем "+fuelPercentage+"%");*/
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Capasity getCapasity() {
        return capasity;
    }

    public void setCapasity(Capasity capasity) {
        this.capasity = capasity;
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Диагностика не требуется");
        return false;
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
        System.out.println("Автобус прошел Пит Стоп");

    }

    @Override
    public int BestTime() {
        return BEST_TIME;
    }

    @Override
    public int MaxSpeed() {
        return MAX_SPEED;
    }

    @Override
    public void printType() {
        if (capasity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(" Вместимость : от " + capasity.getFrom() + " до " + capasity.getTo());
            ;
        }

    }
    @Override
    public void repair() {
        System.out.println(" Автобус "+getBrand()+getModel()+ " починен! ");

    }
}
