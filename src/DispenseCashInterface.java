import Model.AccountParameters;

import java.util.List;

public interface DispenseCashInterface {

    public boolean CanDispense(AccountParameters parametersList,int pin);

    public double ReturnBalance(double amountWithdrawn);

    public String ReturnErrorMessage(int error_code);
}
