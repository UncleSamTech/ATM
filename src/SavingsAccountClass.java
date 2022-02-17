import Model.AccountParameters;

public class SavingsAccountClass extends AccountClass implements DispenseCashInterface {

    public SavingsAccountClass(double accountBalance) {
        super(accountBalance);
    }

    /**
     * the dispense method here can only dispense cash when account balance is greater than or equal 1000
     * @param parametersList contains list of expected parameters
     * @return true/false
     */
    @Override
    public boolean CanDispense(AccountParameters parametersList, int pin) {
        return parametersList.getBalance() > 1000 &&  pin == 2343;
    }

    @Override
    public double ReturnBalance(double amountWithdrawn) {
        if(this.getAccountBalance() - amountWithdrawn < 1000)
            return -1;
        else if(this.getAccountBalance() < amountWithdrawn)
            return -2;
        else{
            return this.getAccountBalance() - amountWithdrawn;
        }

    }

    @Override
    public String ReturnErrorMessage(int error_code) {
        return switch (error_code) {
            case -1 -> "You cant have a balance less than 1000 balance for savings account";
            case -2 -> "You don't have sufficient account balance";
            default -> "Unexpected error occurred";
        };

    }

}
