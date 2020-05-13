package day06.day06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {
        int offerCount=4;
        //offerCount=offerCount+1;
        System.out.println(" offer count was :"+ offerCount);
        offerCount+=5;// adds 5to 4
        ++offerCount; // adds Only 1 to the previous result
// --offerCount decreases by 1
        --offerCount;// decreases ONLY 1
        System.out.println("offer now is "+ offerCount);

    }
}
