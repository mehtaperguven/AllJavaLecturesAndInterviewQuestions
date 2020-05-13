package day015;

public class SubstringPractice {
    public static void main(String[] args) {
        
        // getting the part of the String out of another string
        //            0123456789012345   length of the string is 16
        String movie="Lord Of The Ring";
        
        //I want to get the word "of" from the movie name
    String wordOf= movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);
    String wordThe=movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);
        String secondWordTillLast =movie.substring(5,16);
        System.out.println("secondWordTillLast = " + secondWordTillLast);
        //System.out.println(movie.substring(5,16));
        System.out.println(movie.substring(0,7));

        //get the second word
        //if we find first space we can find the index of second word
        int movieIndexOfFirstSpace=movie.indexOf(" ");
        System.out.println("movieIndexOfFirstSpace = " + movieIndexOfFirstSpace);
        int movieLength=movie.length();//length of the string is 16
        System.out.println("movieLength = " + movieLength);

        String lastPartAfterFirstSpace=movie.substring(movie.indexOf(" ")+1,movie.length());
        System.out.println(lastPartAfterFirstSpace);
        //substring method usage if you have only beginning index
String secondToLast=movie.substring(5);
        System.out.println("secondToLast = " + secondToLast);
//*************************************

        //              0123456789012345   length of the string is 16
       // String movie="Lord Of The Ring";
        //instead use substring Ring Of The Lord
        System.out.println("***********");
        String ringOfTheLord=(movie.substring(12,16)+" "+movie.substring(5,7)+" "+movie.substring(8,11)+" "+movie.substring(0,4));
        System.out.println(ringOfTheLord);

        //ANOTHER WAY TO WRITE RING OF THE LORD
        String wordRing=movie.substring(12);//finds from index 12 till end!!!
        String wordOfThe=movie.substring(4,12);//we used with space _of the
       // System.out.println(wordOfThe);
        String wordLOrd=movie.substring(0,4);
        System.out.println(wordRing+wordOfThe+wordLOrd);

    }
}
