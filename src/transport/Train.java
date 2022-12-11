package transport;

public class Train extends Transport {
    private double priceOfTrip;
    private int travelTime;
    private String stationName;
    private String finalStop;
    private int namberOfWagons;

    public Train(String brand, int year, String country, double priceOfTrip, int travelTime, String stationName, String finalStop, int namberOfWagons) {
        super(brand, year, country);
        if (priceOfTrip <= 0) {
            this.priceOfTrip = Math.abs(priceOfTrip);
        } else {
            this.priceOfTrip = priceOfTrip;
        }
        if (travelTime < 0) {
            this.travelTime = Math.abs(travelTime);
        } else {
            this.travelTime = travelTime;
        }
        if (stationName == null || stationName.isBlank()) {
            this.stationName = "Информация не указана";
        } else {
            this.stationName = stationName;
        }
        if (finalStop == null || finalStop.isBlank()) {
            this.finalStop = "Информация не указана";
        } else {
            this.finalStop = finalStop;
        }
        if (namberOfWagons <= 0) {
            this.namberOfWagons = Math.abs(namberOfWagons);
        } else {
            this.namberOfWagons = namberOfWagons;
        }

    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(double priceOfTrip) {
        this.priceOfTrip = priceOfTrip;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNamberOfWagons() {
        return namberOfWagons;
    }

    public void setNamberOfWagons(int namberOfWagons) {
        this.namberOfWagons = namberOfWagons;
    }
}
