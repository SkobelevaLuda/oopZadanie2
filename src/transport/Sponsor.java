package transport;

import java.util.Objects;

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

    public void toSponsorRase() {
        System.out.printf(" Спонсор %s проспонстровал заезд на %d%n ,", sponsorName, amount);
    }

    @Override
    public String toString() {
        return "Название " + sponsorName + ", сумма поддержки " + amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sponsor)) return false;
        Sponsor sponsor = (Sponsor) o;
        return getAmount() == sponsor.getAmount() && Objects.equals(getSponsorName(), sponsor.getSponsorName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSponsorName(), getAmount());
    }
}
