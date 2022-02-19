public class AccountClass {
private double AccountBalance;
private String AccountName;
private String AccountType;


    public AccountClass(double accountBalance) {
        AccountBalance = accountBalance;
    }

    public AccountClass() {
    }

    public double getAccountBalance() {
        return AccountBalance;
    }


    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }
}

