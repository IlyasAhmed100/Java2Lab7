import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
       HashSet<BankAccount> bankAccounts = new HashSet<BankAccount>();
        bankAccounts.add(new BankAccount(123000, 321000));
        bankAccounts.add(new BankAccount(555000, 555000));
        bankAccounts.add(new BankAccount(123000, 321000));

        for (BankAccount bankAccount : bankAccounts) {
            System.out.println(bankAccount);
        } 

        BankAccount b1, b2, b3;

        b1 = new BankAccount(123000, 321000);
        b2 = new BankAccount(555000, 555000);
        b3 = new BankAccount(123000, 321000);

        System.out.println(b1.equals(b3));
        System.out.println(b1.equals(b2));

        System.out.println("\n");
        
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());
    }
}
