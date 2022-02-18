public abstract class PaymentAbstractClass {

    public abstract int DeductCharges(float taxRate);
    public abstract String UpdateStatus(String response, int AccountType,double amount, int pin);

}
