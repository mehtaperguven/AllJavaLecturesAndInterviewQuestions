package day035;

public class CharacterPractice2 {
    public static void main(String[] args) {



        System.out.println(sum("A34B123C4X"));
        System.out.println(sum("br456klm9"));
        System.out.println(sumUsingForEach("98mBt59"));
    }
    public static int sum(String str){
        int sum=0;
        for (int i=0;i<str.length();i++){

            if (Character.isDigit(str.charAt(i))){
                char numsChar=str.charAt(i);
                sum+=Integer.parseInt(numsChar+"");
            }

        }
        return sum;
       // System.out.println(sum);
    }
    public static int sumUsingForEach(String str){

        int sum1=0;
        char[] arr=str.toCharArray();//!!!!!!!converting string to char array
        for (char each:arr){
            if (Character.isDigit(each)){
                sum1+=Integer.valueOf(each+"");
            }
        }
        return sum1;
    }
}
