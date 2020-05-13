package day058;

public class RunTimeError {
    static int num=0;

    public static void main(String[] args) {//StackOverflowError gives

        num++;
        System.out.println("num = "+num);
        main(null);
    }
}
//whenever method is called in Java,
// a frame is placed in Stack memory for that method call
//if method calls itself (above main() calls main()) recursively,
// another frame is placed.....