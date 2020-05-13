package day052.BookPOlymorphism;

import java.awt.print.Paper;
import java.util.Arrays;
import java.util.List;

public class BookCountingPOlymorphism {
    public static void main(String[] args) {
//reference type is BOOK , actual object type is PaperBook or AudioBook
        Book b1=new AudioBook("JavaScript","Kuzzat",3);
        Book b2=new PaperBook("Java","Tim Buchalka",2);
        Book b3=new PaperBook("Agile","GulCannat",2);
        Book b4=new AudioBook("Testing STLC","Kuzzat",3);
        Book b5=new PaperBook("Erva","Feyza",4);


    List<Book> lst= Arrays.asList(b1,b2,b3,b4,b5);
    for (Book each:lst){
        //each.displayBookInfo();
        System.out.println( each.getClass().getSimpleName());
    }
    int countAudio=0;int countPaper=0;
    for (Book each:lst){
        if (each.getClass().getSimpleName().equalsIgnoreCase("AudioBook")){
            countAudio++;
        }else{
            countPaper++;
        }
    }
        System.out.println(countAudio);
        System.out.println(countPaper);
    }
}
