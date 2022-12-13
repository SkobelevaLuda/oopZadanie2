package transport;

public class Bus extends Transport{
    private double engineVolume;
    public Bus(String brand, int year, String country,int maxSpeed, double fuelPercentage, double engineVolume) {
        super(brand, country);
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public Bus(String brand,
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

    @Override
    public void startMoving() {
        System.out.println("Начать движение!");
    }

    @Override
    public void finishOfMoving() {
        System.out.println(" Закончить движение!");
    }
}
