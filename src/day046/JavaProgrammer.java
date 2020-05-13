package day046;

public class JavaProgrammer extends Programmer {
    public JavaProgrammer() {
    }
@Override
    public void code(){
        super.code();
        System.out.println("Java programmer code");
    }
    @Override
    public void test(){
        super.test();
        System.out.println("Java programmer test");
    }

    public void doRepl(){
        System.out.println("Do more Repl for better future");
    }

    public void doJavaDevelopment(){
        System.out.println("Still developing");
    }
}
