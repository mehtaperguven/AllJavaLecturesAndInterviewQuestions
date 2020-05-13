package day017;


import java.util.Scanner;

    public class NameReverse {
        public static void main(String[] args) {
            //print  your name reversely

            Scanner scan=new Scanner(System.in);
            System.out.println("please enter your name ");
            String name=scan.nextLine();

            int z = name.length()-1;
            while (z >= 0) {
                System.out.println("index is "+z+" : "+name.charAt(z));
                --z;
            }
        }
    }

