package transport;

public class Truck extends Transport implements Competing {
    private Weigth weigth;
    private double engineVolume;

    public static final int BEST_TIME = 22;
    public static final int MAX_SPEED = 44;


    public Truck(String brand,
                 String model,
                 double engineVolume, Weigth weigth, boolean diagnostic) {
        super(brand, model, diagnostic);
        this.weigth = weigth;
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

    public Weigth getWeigth() {
        return weigth;
    }

    public void setWeigth(Weigth weigth) {
        this.weigth = weigth;
    }

    @Override
    public boolean passDiagnostics() {
        if (diagnostic=true){
            System.out.println("Диагностика пройдена");
        }else{
            throw new RuntimeException();
        }
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
        System.out.println("Грузовик прошел Пит Стоп");

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
        if (weigth == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            String from = weigth.getFrom() == null ? "" : " от " + weigth.getFrom() + " ";
            String to = weigth.getTo() == null ? "" : " до " + weigth.getTo();
            System.out.println(" Грузоподьемность : " + from + to);
            ;
        }
    }
    @Override
    public void repair() {
        System.out.println(" Грузовик "+getBrand()+getModel()+ " починен! ");

    }
}
