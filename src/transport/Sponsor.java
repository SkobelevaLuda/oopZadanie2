package transport;

public class Sponsor {
    private final String sponsorName;
    private final int amount;

    public String getSponsorName() {
        return sponsorName;
    }

    public int getAmount() {
        return amount;
    }

    public Sponsor(String sponsorName, int amount) {
        this.sponsorName = sponsorName;
        this.amount = amount;

    }
    public void toSponsorRase(){
        System.out.printf(" Спонсор %s проспонстровал заезд на %d%n ,", sponsorName, amount);
    }
}
