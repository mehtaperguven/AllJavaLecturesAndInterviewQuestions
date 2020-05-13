package day031;

public class MethodPractice2 {
    //print from 1 to 10
    //give a name count1to10        :method name
    //no need object when being called: static
    //it should be accessible in your project:public
    //it does not return any value :void
    //does not need any external data when being called:(nothing inside)

   public static void count1to10(){
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
    }
        System.out.println();
   }
    public static void main(String[] args) {


count1to10();
count1to10();
///optionally we can use className.methodName();
MethodPractice2.count1to10();
        }

        //AS LONG AS IT IS INSIDE THE CLASS
    //DOES NOT MATTER WHERE YO PUT THE METHOD
    //
    }

