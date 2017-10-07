package bank;

/**
 * Created by reyma on 30/01/2017.
 */
public class BankTeller {
    public  void deposit(BankAccount account, double amount){
        boolean result = account.deposit(amount);
        if(result){
            System.out.println("Succesful deposit of $ " + amount);
        }else{
            System.out.println("Error on deposit");
        }
    }

    public  void withdraw(BankAccount account, double amount){
        boolean result = account.withdraw(amount);
        if(result){
            System.out.println("Succesful withdraw of $ " + amount);
        }else{
            System.out.println("Error");
        }
    }
}
