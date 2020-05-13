package day046;

public class TestingBankAccount {

    public static void main(String[] args) {
        CheckingAccount c1=new CheckingAccount("Erva",1234567,10000);
       c1.deposit(100);
        System.out.println("c1 = " + c1);
        c1.deposit(6000);
        System.out.println("c1 = " + c1);
        c1.withdraw(5000);
        System.out.println("c1 = " + c1);
        
        
        SavingAccount ss1=new SavingAccount("Dilara",11223344,20000,0.003);
        ss1.deposit(200);
        System.out.println("ss1 = " + ss1);
        System.out.println(ss1);
    }
}
