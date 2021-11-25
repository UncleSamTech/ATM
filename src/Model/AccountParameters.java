package Model;

public class AccountParameters {
    public double balance;
    public int periodSaved;

    public AccountParameters(double balance) {
        this.balance = balance;

    }

    public AccountParameters(double balance, int periodSaved) {
        this.balance = balance;
        this.periodSaved = periodSaved;
    }
}
