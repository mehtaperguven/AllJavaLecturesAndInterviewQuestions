package day040;

public class BankAccount {
//access modifiers public/private/default(no modifier)/protected
    String accountType;
    String accountHolder;
    long accountNumber;
    double balance;
    //showAccountBalance
    //showAccountHolderAccountType
    //getBalance ....will return value
    //deposit (amount)
    //withdraw(amount) //paracekme
    //withdraw100$Cash()
    //purchaseProduct(productPrice, count)
    //toString()
    public void setAllValues(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance){
        accountType=newAccountType;
        accountNumber=newAccountNumber;
        accountHolder=newAccountHolder;
        balance=newBalance;

    }
    public void showAccountBalance(){
        System.out.println("Balance =  "+balance);
    }public void showAccountHolderAccountType(){
        System.out.println("Account Type = "+accountType);
    }public double getBalance(){

        return balance;
    }public void deposit(double amount){
        balance=balance+amount;
    }public void widthdraw(double amount){
        balance=balance-amount;
    }public void withdraw100$Cash(){
        widthdraw(100);
        //balance=balance -100;
    }public void purchaseProduct(double productPrice, int count){
        double totalPrice=productPrice*count;
        balance=balance-totalPrice;
        //or
        //widthdraw(totalPrice);
    }public String toString(){
        String str=" accountType " +accountType+
                "  accountHolder " +accountHolder+
                "  accountNumber " +accountNumber+
                "   balance "+balance;
        return str;

    }
}
