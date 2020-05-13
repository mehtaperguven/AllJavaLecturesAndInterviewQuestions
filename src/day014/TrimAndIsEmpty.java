package day014;

public class TrimAndIsEmpty {

    public static void main(String[] args) {
        String message="   REPL IS COMING !  ";
        System.out.println(message);
        System.out.println("message character count is "+ message.length());

        //trim method is used to take out spaces on two sides
        //not in between
        message=message.trim();
        System.out.println(message);
        //System.out.println(message.trim());
        System.out.println("message character count is "+message.length());

        String s4="Hello";
        String s5=s4.replace("ello","appy");
        System.out.println(s5);
        String name="Mehtap";
        System.out.println(name.charAt(0)+" " + name.charAt(1) +" "+ name.charAt(2)+" "+name.charAt(3)+" " +name.charAt(4)+" "+name.charAt(5));

    }
}
