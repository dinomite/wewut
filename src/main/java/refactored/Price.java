package refactored;

public abstract class Price {
    public abstract double getCharge(int daysRented);

    public int getPoints(int daysRented) {
        return 1;
    }
}
