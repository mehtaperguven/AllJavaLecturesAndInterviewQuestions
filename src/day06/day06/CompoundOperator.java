package day06.day06;

public class CompoundOperator {
    public static void main(String[] args) {
        //ASSIGNMENT OPERATOR calculates the operation on the right
        // and assign the RESULT to the left

        int studentOnline=263;
        studentOnline=studentOnline+5;// it is 268
        System.out.println("5 people join the class "+studentOnline);// prints 268

        studentOnline=studentOnline-3; //265
        System.out.println("3 people left the class  "+studentOnline);

        studentOnline=studentOnline*2;
        System.out.println("students doubled " +studentOnline);

        studentOnline=studentOnline/3;
        System.out.println("numbers of the students dropped to 1/3 :  " +studentOnline);

    }
}
