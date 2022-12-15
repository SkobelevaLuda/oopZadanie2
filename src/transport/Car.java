package transport;

public class Car extends Transport implements Competing {
    public TypeOfBody typeOfBody;

    private double engineVolume;

    //private String transmission;
    //private final String bodyType;
    //private String registrtionNumber;
    //private final int numberOfSeats;
    //private boolean typeOfRubber;
    //private Key key;
    //private Insurance insurance;

    public static final int BEST_TIME = 8;
    public static final int MAX_SPEED = 44;


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    /*public Car(String brand,
               String model,
               int year, String country,
               String bodyType,
               int numberOfSeats, String transmission, double fuelPercentage) {
        super(brand, country);
        {

            if (engineVolume == 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
        }*/


    public Car(String brand, String country, TypeOfBody typeOfBody, double engineVolume) {
        super(brand, country);
        this.typeOfBody = typeOfBody;
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }
    /*if (bodyType == null) {
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

    }*/


              /*public String getTransmission () {
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
            }*/


    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
        System.out.println("Машина прошла Пит Стоп");

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
        if (typeOfBody == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(" Тип кузова: " + typeOfBody);
        }
    }
}






