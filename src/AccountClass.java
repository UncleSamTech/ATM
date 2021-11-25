public class AccountClass {
private String AccountName;
private String AccountType;
private double AccountBalance;
private int AccountPin;

    public AccountClass(double accountBalance) {
        AccountBalance = accountBalance;
    }

    public AccountClass() {
    }

    public String getAccountName() {
        return AccountName;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }

    public int getAccountPin() {
        return AccountPin;
    }

    public void setAccountPin(int accountPin) {
        AccountPin = accountPin;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }


}

