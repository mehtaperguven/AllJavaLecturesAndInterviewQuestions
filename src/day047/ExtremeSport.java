package day047;

public class ExtremeSport extends Sport {
@Override
    public void doSomething(){
    super.doSomething();
        System.out.println("doing extreme sport");
    }
    @Override
public final void doSomethingElse(){
    System.out.println("Doing something else in extreme sport");
}
//above finalizing method is possible
   // we can not change method using final

}
