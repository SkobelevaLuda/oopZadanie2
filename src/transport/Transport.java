package transport;

import java.util.*;

public abstract class Transport {

    public abstract boolean passDiagnostics();

    private String brand;
    private String model;
    public boolean diagnostic;
    private String sponsor;
    private final Set<Driver<?>> participants = new Set<Driver<?>>() {

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Driver<?>> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Driver<?> driver) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Driver<?>> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };

    Set<Mechanic<?>> mechanics = Collections.singleton(new Mechanic<Transport>());
    private final Set<Sponsor> sponsors = new Set<Sponsor>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Sponsor> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Sponsor sponsor) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Sponsor> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };

    public Set<Driver<?>> getParticipants() {
        return participants;

    }

    public Transport(String brand, String country, boolean diagnostic) {
        this.brand = brand;
        if (diagnostic == true) {
            this.diagnostic = diagnostic;
        } else {
            throw new RuntimeException();
        }
    }


    public boolean isDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(boolean diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Transport(boolean diagnostic) {
        this.diagnostic = diagnostic;
    }

    /*private final int year;
    private final String country;
    private String color;
    public int maxSpeed;
    public double fuelPercentage;
     */
    public void AddDriver(Driver<?>... driver) {
        this.participants.addAll(Arrays.asList(driver));
    }

    public void AddMechanic(Mechanic<?>... mechanic) {
        this.mechanics.addAll(Arrays.asList(mechanic));
    }

    public void AddSponsor(Sponsor... sponsor) {
        this.sponsors.addAll(Arrays.asList(sponsor));
    }


    public void Transport(String brand, String model, int year, String country, double fuelPercentage) {
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
        /*if (year <= 0) {
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
        }*/
    }

    public abstract void startMoving();

    public abstract void finishOfMoving();

    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public abstract void repair();

    public void setBrand(String brand) {
        if (brand == null) {
            this.brand = "не указано";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Set<Sponsor> getSponsors() {
        return (Set<Sponsor>) sponsors;
    }

    public String getSponsor() {
        return sponsor;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }
}
