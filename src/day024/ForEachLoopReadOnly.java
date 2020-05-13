package day024;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int yourFavNumber=300;
        int myFavNumber= yourFavNumber;
        myFavNumber=299;
        System.out.println("your favorite number is "+yourFavNumber);
        long [] nums={10,40,20};

        //how do I double my first item in the array??
        //nums[0]=nums[0]*2;
        //System.out.println(nums[0]);
        //in the below we will double values
        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]*2);
        }
        System.out.println("****************");
        //however when we print one more time it gives beginning values
        for (int i = 0; i <3 ; i++) {
            System.out.println(nums[i]);

        }

        System.out.println("**************");
        //to double constantly we should use below code
        for (int i = 0; i < 3; i++) {
            nums[i]=nums[i]*2;
            System.out.println(nums[i]);
        }
//let us assign 100 to each value in nums array
        System.out.println("&&&&&&&&&&&&&&&");
        for (int i = 0; i <3 ; i++) {
            long eachItem=nums[0];
            nums[i]=100;
            System.out.println(nums[i]);
        }

        System.out.println("after we modified by eachItem");
        for (int i = 0; i <3 ; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        //below code will print eachItem as 200
        //However values are not changed not modified
        //FOR EACH LOOP CAN NOT MODIFY ARRAY ELEMENTS ONLY CAN PRINT VISUALLY
        for (long eachItem: nums) {
            eachItem=200;
            System.out.println(eachItem);
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //when we print again element of nums they will be again 100!!
        for (int i = 0; i <3 ; i++) {
            System.out.println(nums[i]);
        }

    }
}
