package day046;

public class BankAccount {
    String accountHolder;
    long accountNum;
    double balance;
public BankAccount(){

}
    public BankAccount(String accountHolder, long accountNum, double balance) {
        //super(); is here if we call or not!!!!
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void deposit(int amount){
        this.balance+=amount;

    }
    public void withdraw(int amount){

        balance-=amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
