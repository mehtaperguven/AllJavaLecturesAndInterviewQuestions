package day045;
//if we do not explicitly(visibly,manually) extends another class
//we always automatically extend Object Class
public class Book extends Object{
@Override//this is called ANNOTATION
//IT SAYS WE ARE REWRITING THE INHERITED SUPER CLASS METHOD

    public String toString() {
        return "my own version of toString";
    }

    public static void main(String[] args) {
        Book b1=new Book();
        System.out.println(b1.toString());//
    }
}
