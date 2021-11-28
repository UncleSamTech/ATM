import Model.AccountParameters;

import java.util.Scanner;

public class VendingMachineClass{
    public static void main(String[] args) {

        System.out.println("Welcome to Vending Machine X..Please select account type => \n Press 1 for : SavingsAccount \n Press 2 for : CurrentAccount \n Press 3 for : FixedDepositAccount");
        int accountType =  new Scanner(System.in).nextInt();

        System.out.println("Please enter your pin");
        int pin = new Scanner(System.in).nextInt();


        System.out.println("Please enter amount");
        double amt = new Scanner(System.in).nextDouble();
       System.out.println(new VendingMachineClass().Vend(accountType,amt,pin));
    }

    private String Vend( int AccountType, double amount,int pin){
        double SavingsBalance = 1200;
        double CurrentBalance = 2500;
        double FixedDepBalance = 5200;
        int Duration = 9;
        AccountParameters parametersSv = new AccountParameters(SavingsBalance);

        AccountParameters parametersCurr = new AccountParameters(CurrentBalance);
        AccountParameters parametersFd = new AccountParameters(FixedDepBalance,Duration);
        SavingsAccountClass savingsAccountClass =  new SavingsAccountClass(SavingsBalance);
        CurrentAccountClass currentAccountClass =  new CurrentAccountClass(CurrentBalance);
        FixedDepositAccountClass fixedDepositAccountClass =  new FixedDepositAccountClass(FixedDepBalance);
        switch (AccountType){
            case 1:
                if(savingsAccountClass.CanDispense(parametersSv,pin)){
                    double bal = SavingsBalance - amount;
                    if(savingsAccountClass.ReturnBalance(amount) == -1 || savingsAccountClass.ReturnBalance(amount) == -2){
                        return savingsAccountClass.ReturnErrorMessage((int)savingsAccountClass.ReturnBalance(amount));
                    }
                    else{
                        return "sum of " + amount + " withdrawn from account with a balance of " + bal + "\n Thank you for banking with us";
                    }

                }
                else{
                    return "Transaction Terminated as a result of invalid pin";
                }
            case 2:
                if(currentAccountClass.CanDispense(parametersCurr,pin)){
                    double bal = CurrentBalance - amount;
                    if(currentAccountClass.ReturnBalance(amount) == -1 || currentAccountClass.ReturnBalance(amount) == -2){
                        return new CurrentAccountClass().ReturnErrorMessage((int)currentAccountClass.ReturnBalance(amount));
                    }
                    else{
                        return "sum of " + amount + " withdrawn from account with a balance of " + bal + "\n Thank you for banking with us";
                    }
                }
                else{
                    return "Transaction Terminated as a result of invalid pin";
                }
            case 3:
                if(fixedDepositAccountClass.CanDispense(parametersFd,pin)){
                    double bal = FixedDepBalance - amount;
                    if(fixedDepositAccountClass.ReturnBalance(amount) == -1 || fixedDepositAccountClass.ReturnBalance(amount) == -2){
                        return fixedDepositAccountClass.ReturnErrorMessage((int)fixedDepositAccountClass.ReturnBalance(amount));
                    }
                    else{
                        return "sum of " + amount + " withdrawn from account with a balance of " + bal + "\n Thank you for banking with us";
                    }
                }
                else{
                    return "Transaction Terminated as a result of invalid pin";
                }
            default:
                return "Invalid account type";
        }

    }
}
