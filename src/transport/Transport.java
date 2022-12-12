package transport;

public abstract class Transport {

    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    public int maxSpeed;
    public double fuelPercentage;

    public Transport(String brand, int year, String country, double fuelPercentage) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (fuelPercentage<=0||fuelPercentage>100) {
            this.fuelPercentage = Double.parseDouble(" Не верное значение");
        }else {
            this.fuelPercentage=fuelPercentage;
        }
    }

    public abstract void refill();

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {

        this.fuelPercentage = fuelPercentage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null||color.isBlank()){
            this.color="Значение не указано";
        }else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed<=0){
            this.maxSpeed=Math.abs(maxSpeed);
        }else {
            this.maxSpeed = maxSpeed;
        }
    }
}
