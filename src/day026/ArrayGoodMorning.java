package day026;

public class ArrayGoodMorning {
    public static void main(String[] args) {

/*ARRAY SUMMARY
  short myNumbers[]=new short[4];

  myNumbers[0]=10;
  myNumbers[1]=40;
  myNumbers[2]=30;
  myNumbers[3]=7;
  I want to add 1 to first item
  myNumbers[1]=myNumbers+1;.........>>>>40+1=41
  //I want to double myNumbers[1]=myNumbers[1]*2;.........>>41*2=82;

 Default value for array item if it is empty
//
//        byte short int long -->> 0
//        float double  --> 0.0
//        char         --- '' empty character
//        boolean      --->> false
//
//        what about non-primitive type : reference type
//        String   --->   null
//
   *

   */
        int myNumbers[]=new int [4];

        myNumbers[0]=10;
        myNumbers[1]=40;
        myNumbers[2]=30;
        myNumbers[3]=7;

        int size=myNumbers.length;
        int lastElement=myNumbers[size-1];
        System.out.println(lastElement);

        myNumbers[1]  =  myNumbers[1]+1;
        System.out.println("Adding 1 to first array"+myNumbers[1]);

        myNumbers[1]=myNumbers[1]*2;
        System.out.println("After doubling "+myNumbers[1]);

        //sum of first two elements assigned to third element myNUmber[2];
        myNumbers[2]=myNumbers[0]+myNumbers[1];





    }
}
