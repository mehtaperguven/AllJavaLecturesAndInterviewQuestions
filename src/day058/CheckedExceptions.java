package day058;

public class CheckedExceptions {
    public static void main(String[] args) {
        System.out.println("checked exception in next line");
       try {
           Thread.sleep(2000);//WAITS FOR 2 SECOND and prints
//int a=10/0;
            //Above is checked exception it is not throwing any exception
            // like runtime Exceptions
      // throw new InterruptedException();
      }catch(InterruptedException e){
            //or catch(Exception e){ will do same thing
            System.out.println("Exception was caught");
        }
        System.out.println("After Thread.sleep");
    }
}
