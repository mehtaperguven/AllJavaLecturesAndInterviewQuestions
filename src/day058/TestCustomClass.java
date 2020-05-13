package day058;

public class TestCustomClass {
    public static void main(String[] args) throws NoBreakTimeException {
boolean studentAskForBreak=true;
if (studentAskForBreak){
    throw new NoBreakTimeException();
}else{
    System.out.println("Continue");
}
      //  method1();
    }
    public static void method1() throws NoBreakTimeException{


    }
}
