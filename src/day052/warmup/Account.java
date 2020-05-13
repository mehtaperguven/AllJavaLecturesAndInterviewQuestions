package day052.warmup;

public class Account implements Transferable,Comparable<Account>{
    protected String name;
    private int balance;


    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

//    public int compareTo(Account otherAccount){
//
//        return 0;
//    }
//


    @Override
    public int compareTo(Account otherAccount) {
        if(this.balance>otherAccount.balance){
            return 1;
        }else if(this.balance<otherAccount.balance){
            return -1;
        }else{
            return 0;
        }
        //below codes makes same thing
        //return this.balance-otherAccount.balance;
    }

    @Override
    public void transferAmount(Account a2, int balance1){
        a2.balance=a2.balance+balance1;
        this.balance=this.balance-balance1;
    }
    @Override
    public void transferAll(Account otherAccount) {
        otherAccount.balance = otherAccount.balance + this.balance;
        this.balance = 0;
        //otherAccount.deposit(balance);
        //withdraw(balance);
    }

    public int getBalance() {
        return balance;
    }


    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount){
        balance=balance-amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean isPalindrome(){
        String temp=this.name.replace(" ","");
        String reverseResult="";
        for (int i=temp.length()-1;i>=0;i--){
            reverseResult=reverseResult+temp.charAt(i);
        }
        return temp.equalsIgnoreCase(reverseResult);
    }
}