package day052.BookPOlymorphism;

public class BookStore {
    public static void main(String[] args) {


Book b1=new AudioBook("JavaScript","Kuzzat",3);
Book b2=new PaperBook("Java","Tim Buchalka",2);
Book b3=new PaperBook("Agile","GulCannat",2);
Book b4=new AudioBook("Testing STLC","Kuzzat",3);

b1.displayBookInfo();
b2.showTableOfContent();
b2.takeNote();

KnowledgeBank kb=b1;
kb.takeNote();
kb.showTableOfContent();




}


    }



