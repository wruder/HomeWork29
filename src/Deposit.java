import java.util.Objects;

public class Deposit {
    private double amount;
    //сумма вклада
    private double interestRate;
    // процентная ставка в процентах
    private int years;
    // длительность в годах

    public Deposit(double amount, double interestRate, int years) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.years = years;
    }
        public double calculatorEarnings() {
            return amount *( Math.pow(1+interestRate / 100,years))-amount;}

    @Override
    public String toString() {
        return "Deposit{" +
                "amount=" + amount +
                ", interestRate=" + interestRate +
                ", years=" + years +
                '}';
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deposit deposit)) return false;
        return Double.compare(getAmount(), deposit.getAmount()) == 0 && Double.compare(getInterestRate(), deposit.getInterestRate()) == 0 && getYears() == deposit.getYears();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmount(), getInterestRate(), getYears());
    }

}

