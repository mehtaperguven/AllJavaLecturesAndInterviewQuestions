package day043;

import day042.Movie;

public class MovieUtility {

    public static void main(String[] args) {
//int x="Joker"; //not right// because x is  CONTAINER CAN STORE NUMBER ONLY
        //Scanner scan="Joker"; not right// scan is container and
        //scan can store address of any Scanner object
//m1 store address of Movie object, new Movie is object, Movie is data type
        Movie m1 = new Movie("Joker", 2.2, "Drama");
        Movie m2 = new Movie("Frozen2", 1.5, "Family");
        Movie m3 = new Movie("Pursuit of Happiness", 2.0, "Drama");
printMovieInformation(m1);
printMovieInformation(m2);
printShorterDurationMovieName(m1,m2);
Movie result=getJokerMovieObject();
result.getName();
        System.out.println("Name is = " + result.getName());
//Integer int1=Integer.valueOf(13);
        //System.out.println(int1);
        printMovieNameCharacters(m1);

    }
//produce a static method that return Joker movie with 2.5 hour and type Drama


    public static Movie getJokerMovieObject(){

        Movie j=new Movie("Joker",2.5,"Drama");
        return j;

    }
    /**
     *we print movie information in below format
     * @param movieObj is our parameter which belongs to Movie class
     */
    public static void printMovieInformation(Movie movieObj) {
        //TODO YOUR CODE HERE
        System.out.print("Movie Name is " + movieObj.getName());
        System.out.print(" it is " + movieObj.getLength()+" hour long ");
        System.out.println(" and its genre is  " + movieObj.getType());
       // System.out.println();

    }
    /**
     * A void method that accept 2 movie objects
     * and print the name of movie with shorter movie length
     * for example Frozen is 1.5 hours , Joker is 2.2 hours
     * so print The shorter movie is : Frozen
     * @param movie1 first movie object
     * @param movie2 second movie object
     */
    public static void printShorterDurationMovieName(Movie movie1, Movie movie2){
if (movie1.getLength()<movie2.getLength()){

    System.out.println(movie1.getName());
}else{
    System.out.println(movie2.getName());
}


    }

    /**
     * A void method that accept any movie object
     * and print out it's name in below format
     * If the movie name is Joker then print J-O-K-E-R (all uppercase)
     * @param movie1 the movie object to get information from
     */
    public static void printMovieNameCharacters(Movie movie1) {
        //TODO YOUR CODE HERE
String dashedStr="";
        String str=movie1.getName();
        for (int i=0;i<str.length()-1;i++){
            dashedStr+=str.charAt(i)+"-";
        }
        System.out.println(dashedStr+str.charAt(str.length()-1));

    }


}
