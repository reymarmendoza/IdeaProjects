import atm.ATM;
import bank.BankAccount;
import bank.BankTeller;

/**
 * Created by reyma on 30/01/2017.
 */
public class Main {
    public static void main (String [] args){
        BankAccount a = new BankAccount(1234, 100.00);
        BankAccount b = new BankAccount(1235, 200.00);
        BankTeller john = new BankTeller();
        john.deposit(a, 100.00);
        ATM xyz = new ATM(222);
        xyz.withdraw(b, 100.00);
    }
}
