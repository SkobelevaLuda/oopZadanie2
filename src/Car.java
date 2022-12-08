public class Car {
    public final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;
    private final String bodyType;
    private String registrtionNumber;
    private final int numberOfSeats;
    private boolean typeOfRubber;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrtionNumber() {
        return registrtionNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean getTypeOfRubber() {
        return typeOfRubber;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission==null||transmission.isBlank()){
            this.transmission = "Тип трансмиссии не указан";
        }else {
            this.transmission = transmission;
        }
    }

    public void setRegistrtionNumber(String registrtionNumber) {
        if (registrtionNumber==null||registrtionNumber.isBlank()){
            this.registrtionNumber= " Регистрационный номер не указан";
        }else {
            this.registrtionNumber = registrtionNumber;
        }
    }

    public void setTypeOfRubber(String typeOfRubber) {
        this.typeOfRubber = Boolean.parseBoolean(typeOfRubber);
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrtionNumber, int numberOfSeats, String typeOfRubber) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        setEngineVolume(engineVolume);
        setColor(color);
        this.year = year;
        this.country = country;
        setTransmission(transmission);
        this.bodyType = bodyType;
        setRegistrtionNumber(registrtionNumber);
        this.numberOfSeats = numberOfSeats;
        setTypeOfRubber(typeOfRubber);
    }

    public void changeTyres(){
        setTypeOfRubber(String.valueOf(!typeOfRubber));
    }
    public boolean isValidNumber(){
        boolean result=true;
        result=result && registrtionNumber.length()==9;
        result=result && Character.isLetter(registrtionNumber.charAt(0));
        result=result && Character.isDigit(registrtionNumber.charAt(1));
        result=result && Character.isDigit(registrtionNumber.charAt(2));
        result=result && Character.isDigit(registrtionNumber.charAt(3));
        result=result && Character.isLetter(registrtionNumber.charAt(4));
        result=result && Character.isLetter(registrtionNumber.charAt(5));
        result=result && Character.isDigit(registrtionNumber.charAt(6));
        result=result && Character.isDigit(registrtionNumber.charAt(7));
        result=result && Character.isDigit(registrtionNumber.charAt(8));
        return result;
    }
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrtionNumber='" + registrtionNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", typeOfRubber=" + typeOfRubber +
                '}';
    }
    public void print(){
        System.out.println(this);
    }
}
