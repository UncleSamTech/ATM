import Model.AccountParameters;
public class FixedDepositAccountClass extends AccountClass implements DispenseCashInterface{



    public FixedDepositAccountClass(double accountBalance) {
        super(accountBalance);
    }

    /**
     * if balance is greater than or equal to 5000 and duration >= 5years
     * @param parametersList contains list of expected parameters
     * @return true/false
     */
    @Override
    public boolean CanDispense(AccountParameters parametersList,int pin) {
        return parametersList.balance >= 5000 && parametersList.periodSaved >= 5 && pin == 2543;
    }

    @Override
    public double ReturnBalance(double amountWithdrawn) {
        if(this.getAccountBalance() - amountWithdrawn < 5000)
            return -1;
        if(this.getAccountBalance() < amountWithdrawn)
            return -2;
        return this.getAccountBalance() - amountWithdrawn;
    }

    @Override
    public String ReturnErrorMessage(int error_code) {
        return switch (error_code) {
            case -1 -> "You cant have a balance less than 5000 for fixed deposit account";
            case -2 -> "You don't have sufficient account balance";
            default -> "Unexpected error occurred";
        };
    }
}
