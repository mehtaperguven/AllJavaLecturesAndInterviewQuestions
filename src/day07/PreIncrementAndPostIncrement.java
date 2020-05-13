package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {
        int apple=10;
        System.out.println("You entered value as : "+apple);
        apple++;//increased by 1 now it is 11
        System.out.println( apple);//printing increased value 11
        System.out.println(++apple);//increasing and printing the value, it is 12
        //apple++ , when ++ comes after the variable
        //it is called POST INCREMENT
        //it will increase the value
        // but it will reflect the increased value the when run next time variable show up
        System.out.println(++apple); // it is 12
        System.out.println(apple++);


        System.out.println("\n"+"\n");
        int score=50;
        System.out.println(score);
        System.out.println(++score);
        System.out.println(score++);
        System.out.println(score);
        System.out.println(--score);
        System.out.println( score --); // still 51 ready to be 50 next time it shows up
        System.out.println(score);




    }
}
