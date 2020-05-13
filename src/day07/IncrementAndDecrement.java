package day07;

public class IncrementAndDecrement {
    public static void main(String[] args) {

        int apple=10;
        System.out.println("original apple is "+apple);
        apple= apple+1;
        apple+=1;// same with the previous line
        ++apple;// same with the previous line
        ++apple; //just increases by 1

        System.out.println("we used ++  four times and result is "+apple);
        --apple;
        System.out.println( "we used -- once then new cost of apple is "+apple);
        System.out.println(++apple);
        System.out.println("used ++ to increase  and concatenate: "+   ++apple);
        System.out.println("used ++ to increase  and concatenate: "+ (++apple));//it is same with previous line
    }
}
