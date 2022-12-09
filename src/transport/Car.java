package transport;

import java.util.Objects;

public class Car {
    private final String brand;
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
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "Тип трансмиссии не указан";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrtionNumber(String registrtionNumber) {
        this.registrtionNumber = registrtionNumber;
    }

    public void setTypeOfRubber(boolean typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        setColor(color);
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.country = Objects.requireNonNullElse(country, "default");
        setTransmission(transmission);
        this.bodyType = "Седан";
        this.numberOfSeats = 5;
        this.typeOfRubber = true;
        this.registrtionNumber = "А111АА222";
    }

    public void changeTyres() {
        typeOfRubber = !typeOfRubber;
    }

    public boolean isValidNumber() {
        boolean result = true;
        result = result && registrtionNumber.length() == 9;
        result = result && Character.isLetter(registrtionNumber.charAt(0));
        result = result && Character.isDigit(registrtionNumber.charAt(1));
        result = result && Character.isDigit(registrtionNumber.charAt(2));
        result = result && Character.isDigit(registrtionNumber.charAt(3));
        result = result && Character.isLetter(registrtionNumber.charAt(4));
        result = result && Character.isLetter(registrtionNumber.charAt(5));
        result = result && Character.isDigit(registrtionNumber.charAt(6));
        result = result && Character.isDigit(registrtionNumber.charAt(7));
        result = result && Character.isDigit(registrtionNumber.charAt(8));
        return result;
    }

    public String toString() {
        return "Автомобиль " +
                "Бренд'" + brand + '\'' +
                ", Модель " + model + '\'' +
                ", объем двигателя " + engineVolume +
                ", цвет'" + color + '\'' +
                ", год выпуска " + year +
                ", страна производитель'" + country + '\'' +
                '}';
    }

}
