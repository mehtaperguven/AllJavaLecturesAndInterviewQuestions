package day052.warmup;

public class BankTest {
    public static void main(String[] args) {

        Account a1=new Account("JoJ joj",10000);
        Account a2=new Account("Arya Stark",8000);
        System.out.println("Before transfer a1 "+a1);
        System.out.println("before transfer a2 "+a2);

        a1.transferAll(a2);
        System.out.println("After transfer a1 "+a1);
        System.out.println("After transfer a2 "+a2);

        a2.transferAll(a1);
        System.out.println("After second  transfer a1 "+a1);
        System.out.println("After second transfer a2 "+a2);
        a1.isPalindrome();
        System.out.println("The name palindrome "+a1.isPalindrome());

        Account a3=new Account("Erva Erguven",13000);
        System.out.println(a3);
        System.out.println( a3.getBalance());
        a3.transferAmount(a1,5000);
        System.out.println("a3 = " + a3);
        System.out.println("a1 = "+a1);

    }
}
