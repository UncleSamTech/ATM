import Model.AccountParameters;

public class CurrentAccountClass extends AccountClass implements DispenseCashInterface{

    public CurrentAccountClass() {
    }


    public CurrentAccountClass(double accountBalance) {
        super(accountBalance);
    }

    /**
     * if balance is greater than or equal to 2000
     * @param parametersList contains list of expected parameters
     * @return true/false
     */
    @Override
    public boolean CanDispense(AccountParameters parametersList, int pin) {
        return parametersList.getBalance() > 2000 && pin == 3454;
    }

    @Override
    public double ReturnBalance(double amountWithdrawn) {
        if(this.getAccountBalance() - amountWithdrawn < 2000)
            return -1;
        if(this.getAccountBalance() < amountWithdrawn)
            return -2;
        return this.getAccountBalance() - amountWithdrawn;
    }

    @Override
    public String ReturnErrorMessage(int error_code) {
        return switch (error_code) {
            case -1 -> "You cant have a balance less than 2000 for current account";
            case -2 -> "You don't have sufficient account balance";
            default -> "Unexpected error occurred";
        };
    }
}
