package day046;

public class CheckingAccount extends BankAccount{
    
    //we can have more instance fields
    //However here we do not have additional field
//    String accountHolder;
//    long accountNum;
//    double balance;
    //Above came from super class BankAccount directly
    
    //we have constructor in below
    public CheckingAccount(String accountHolder,long accountNum,double balance){
        
        super(accountHolder,accountNum,balance);
    }

    @Override
    public void deposit(int amount) {
        if (amount>=3000){
            super.deposit(amount+200);
        }else{
            super.deposit(amount);
        }
        
    }

}
