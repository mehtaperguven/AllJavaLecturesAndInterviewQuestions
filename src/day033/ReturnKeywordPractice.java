package day033;

public class ReturnKeywordPractice {
    public static void main(String[] args) {
        //System.out.println(calculateAndReturnAge(1976));
int []array={1999,122,2019, 1987, 1978,1964,3999, 2004};
//for each implementation
for (int each:array){
    System.out.print(calculateAndReturnAge(each)+" ");
}
        System.out.println();
//for loop implementation
for (int i=0;i<array.length;i++){
    System.out.print(calculateAndReturnAge(array[i])+" ");
}
    }

    public static int calculateAndReturnAge(int birthYear) {

        if (birthYear <= 2020 && birthYear >= 1900) {
            int age = 2020 - birthYear;
            return age;
        } else {
            return 0;
        }
    }

}