public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        if (this.brand==null){
            this.brand="default";
        }
        this.model = model;
        if (this.model==null){
            this.model="default";
        }
        this.engineVolume = engineVolume;
        if (this.engineVolume<=0){
            this.engineVolume=1.5;
        }
        this.color = color;
        if (this.color==null){
            this.color="Белый";
        }
        this.year = year;
        if (this.year<=0){
            this.year=2000;
        }
        this.country = country;
        if (this.country==null){
            this.country="default";
        }
    }

    void cars() {
        System.out.println(brand + model + engineVolume + color + year + country);
    }


}
