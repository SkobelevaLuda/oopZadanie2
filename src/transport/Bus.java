package transport;

public class Bus extends Transport{
    public Bus(String brand, int year, String country,int maxSpeed, double fuelPercentage) {
        super(brand, year, country, fuelPercentage);
        if (maxSpeed<=0){
            this.maxSpeed=Math.abs(maxSpeed);
        }else {
            this.maxSpeed = maxSpeed;
        }

    }


    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем "+fuelPercentage+"%");
    }
}
