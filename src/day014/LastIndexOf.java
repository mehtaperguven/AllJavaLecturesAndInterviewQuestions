package day014;

public class LastIndexOf {
    public static void main(String[] args) {

        String name="Game of Java";
        //find out  last location the letter "a" shows up
        System.out.println("find out  last location the letter \"a\" shows up");
        System.out.println(name.lastIndexOf("a"));
        //find out  last location the character space shows up
        System.out.println("find out  last location the character space shows up");
        System.out.println(name.lastIndexOf(" "));
        //find out last location letter Ga shows up
        System.out.println("find out last location letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga"));

        //find out last location the word Kawa
        System.out.println("find out last location the word Kawa");
        System.out.println(name.lastIndexOf("Kawa"));
        //if i do not use contains method we can use indexOf or lastIndex
        if (name.indexOf("Kawa")>-1){
            System.out.println("Kawa is in the text");
        }else{
            System.out.println("Kawa is not in the text");
        }


    }

}
