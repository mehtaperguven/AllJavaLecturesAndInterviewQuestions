package day046;

public class SavingAccount extends BankAccount{
//    String accountHolder;
//    long accountNum;
//    double balance;
    //the above variables became from BankAccount(parent class)

    double interestRate;

    /**
     *
     * @param accountHolder
     * @param accountNum
     * @param balance
     * @param interestRate
     */

    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate) {
        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;
    }
    //in saving account
    // if we withdraw any amount we get 30$ penalty
    //we will override the withdraw method
    // which we have in parent to do this requirement as below
    //same method name, same parameter
    //we override to reuse code easily
    @Override
    public void withdraw(int amount){
        balance=(balance-amount)-30;///balance was 55000
        super.withdraw(30);//now balance is 44940
       // super.withdraw(30);//now balance is 44910

    }
    @Override
    public void deposit(int amount) {//we can not change int to double
        //since it was method overriding .Parameters must be same
        //with the Super class' deposit method!!

        // balance += amount+(amount*0.042);
        //instead we can do below which gives same value
        int actualAmount=(int)(amount+amount*interestRate);
        super.deposit(actualAmount);

    }
    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }

    ///it is not offered to put main in template
    public static void main(String[] args) {

        SavingAccount s1=new SavingAccount("Dilara",12345,50000,0.042);
        System.out.println("we use withdraw() method");
        System.out.println(s1);
        s1.withdraw(10000);
        System.out.println("s1 = "+s1);
        SavingAccount s2=new SavingAccount("Erva",1234455,20000,0.042);
        System.out.println();
        System.out.println("we use deposit() method");
        System.out.println(s2);
        s2.deposit(1000);
        System.out.println("s2 = " + s2);
    }
}
