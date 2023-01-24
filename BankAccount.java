public class BankAccount {
    
    private int accountNumber;
    private int sortCode;
    private static final int PRIME_NUMBER_A = 97;
    private static final int PRIME_NUMBER_B = 89;

    public BankAccount(int accountNumber, int sortCode) {
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (obj.getClass() != this.getClass()) {
            return false;
        } 

        BankAccount otherBankAccount = (BankAccount) obj;
        if (otherBankAccount.accountNumber == this.accountNumber && otherBankAccount.sortCode == this.sortCode) {
            return true;
        } 
        return false;
    }

    public int hashCode() {
        int accountNumberPrime = this.accountNumber * PRIME_NUMBER_A;
        int sortCodePrime = this.sortCode * PRIME_NUMBER_B;
        int total = accountNumberPrime + sortCodePrime;
        return total;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSortCode() {
        return sortCode;
    }

    public String toString() {
        return "The account number is " + getAccountNumber() + " and the SortCode is " + getSortCode();
    }


}   
