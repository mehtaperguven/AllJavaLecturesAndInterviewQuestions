package day014;

public class IndexOfPractice {
    public static void main(String[] args) {
        //indexOf
        //find out index of another string inside the string

        String name="Game of Java";//length is 12 and last char index is 11




        //find out location of Java
        System.out.println("find out the location of Java");
        System.out.println(name.indexOf("Java"));//..8
        //find out the location of letter o
        System.out.println("find out the location of o");
        System.out.println(name.indexOf("o"));//..5
        //if the location is not found , we get minus number -1
        System.out.println("find out the location of uppercase  O");
        System.out.println(name.indexOf("O"));//..-1
        //find out the location of first space
        System.out.println("find out the location of first space ");
        System.out.println(name.indexOf(" "));//..4


    }
}
