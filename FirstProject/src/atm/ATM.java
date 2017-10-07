package atm;

import bank.BankAccount;

/**
 * Created by reyma on 30/01/2017.
 */
public class ATM {
    private int id;

    public ATM(int id){
        this.id = id;
    }
    // realize import the package where are the classes i'd implemented
    public  void withdraw(BankAccount account, double amount){
        boolean result = account.withdraw(amount);
        if(result){
            System.out.println("Succesful withdraw of $ " + amount);
        }else{
            System.out.println("Error on ATM");
        }
    }
}
