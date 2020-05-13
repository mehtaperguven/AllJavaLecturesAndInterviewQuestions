package day015;

public class ReversingAString {
    public static void main(String[] args) {
//how to reverse your name
        String name="mehtap";

        //System.out.println(nameLength);
        System.out.println(name.charAt(0)+" "+ name.charAt(1)+" "+name.charAt(2)
        +" "+ name.charAt(3)+" "+ name.charAt(4)+" "+ name.charAt(5));
        System.out.println(name.charAt(5)+" "+ name.charAt(4)+" "+name.charAt(3)
                +" "+ name.charAt(2)+" "+ name.charAt(1)+" "+ name.charAt(0));

   //How do you find out last character of any string
        //counting character start with 1
        //counting index start with 0
        //so last character index is 1 less than character count
        //mehtap has 6 characters
        //012345 last index of my name is 5  which is 6-1=5

        int characterCount= name.length();
        int lastCharIndex=characterCount-1;// we find  index of last character
        char lastChar=name.charAt(lastCharIndex);
        System.out.println("Last character is "+ lastChar);
        System.out.println("last char in one step by  \" name.charAt(name.length()-1)\"");
        System.out.println(name.charAt(name.length()-1));

    }
}
