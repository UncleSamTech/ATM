package Model;

public class AccountParameters {
    private double balance;
    private int periodSaved;

    public AccountParameters(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPeriodSaved() {
        return periodSaved;
    }

    public void setPeriodSaved(int periodSaved) {
        this.periodSaved = periodSaved;
    }

    public AccountParameters(double balance, int periodSaved) {
        this.balance = balance;
        this.periodSaved = periodSaved;
    }
}
