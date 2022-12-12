package transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;

    private String transmission;
    private final String bodyType;
    private String registrtionNumber;
    private final int numberOfSeats;
    private boolean typeOfRubber;
    private Key key;
    private Insurance insurance;


    public Car(String brand,
               String model,
               int year, String country,
               String bodyType,
               int numberOfSeats, String transmission, double fuelPercentage) {
        super(brand, year, country,fuelPercentage);{

            if (engineVolume == 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
            this.engineVolume = engineVolume;
        }
        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = Math.abs(numberOfSeats);
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        this.transmission = "МКПП";
        this.registrtionNumber = "х000хх000";
        this.typeOfRubber = true;
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }

    }


        public double getEngineVolume () {
            return engineVolume;
        }

        public String getTransmission () {
            return transmission;
        }

        public String getBodyType () {
            return bodyType;
        }

        public String getRegistrtionNumber () {
            return registrtionNumber;
        }

        public int getNumberOfSeats () {
            return numberOfSeats;
        }

        public boolean isTypeOfRubber () {
            return typeOfRubber;
        }

        public Key getKey () {
            return key;
        }

        public Insurance getInsurance () {
            return insurance;
        }


        public void setEngineVolume ( double engineVolume){
            this.engineVolume = engineVolume;
        }

        public void setTransmission (String transmission){
            if (transmission == null) {
                this.transmission = "МККП";
            } else {
                this.transmission = transmission;
            }
        }

        public void setRegistrtionNumber (String registrtionNumber){
            if (registrtionNumber == null) {
                this.registrtionNumber = "х000хх000";
            } else {
                this.registrtionNumber = registrtionNumber;
            }
        }

        public void setTypeOfRubber ( boolean typeOfRubber){
            this.typeOfRubber = typeOfRubber;
        }

        public void setKey (Key key){
            this.key = key;
        }

        public void setInsurance (Insurance insurance){
            this.insurance = insurance;
        }

        public void changeTyers () {
            typeOfRubber = !typeOfRubber;
        }
        public boolean isCorrectedReg () {
            if (registrtionNumber.length() != 9) {
                return false;
            }
            char[] chars = registrtionNumber.toCharArray();
            if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
                return false;
            }
            if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                    !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
                return false;
            }
            return true;
        }


    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем или заряжать на электропарковках,"+fuelPercentage+"%");
    }

    public static class Key {
            private final boolean remoteEngineStart;
            private final boolean keylessAccess;

            public Key(boolean remoteEngineStart, boolean keylessAccess) {
                this.remoteEngineStart = remoteEngineStart;
                this.keylessAccess = keylessAccess;
            }

            public Key() {
                this(false, false);
            }

            public boolean isRemoteEngineStart() {
                return remoteEngineStart;
            }

            public boolean isKeylessAccess() {
                return keylessAccess;
            }
        }
        public class Insurance {
            private final LocalDate expireDate;
            private final double cost;
            private final String number;

            public Insurance(LocalDate expireDate, double cost, String number) {
                if (expireDate == null) {
                    this.expireDate = LocalDate.now().plusDays(365);
                } else {
                    this.expireDate = expireDate;
                }
                this.cost = cost;
                if (number == null) {
                    this.number = "000_000_000";
                } else {
                    this.number = number;
                }
            }

            public Insurance() {
                this(null, 0, null);
            }

            public LocalDate getExpireDate() {
                return expireDate;
            }

            public double getCost() {
                return cost;
            }

            public String getNumber() {
                return number;
            }

            public void checkExpireDate() {
                if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                    System.out.println("Нужно срочно ехать оформлять новую страховку");
                }
            }

            public void checkNumber() {
                if (number.length() != 9) {
                    System.out.println("Номер страховки некорректный!");
                }
            }

        }

    }





