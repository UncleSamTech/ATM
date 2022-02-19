import Model.AccountParameters;

public interface DispenseCashInterface {

    boolean CanDispense(AccountParameters parametersList,int pin);

    double ReturnBalance(double amountWithdrawn);

    String ReturnErrorMessage(int error_code);
}
