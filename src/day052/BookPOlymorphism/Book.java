package day052.BookPOlymorphism;
/*-- abstract
Book
	String name
	String author
-- add constructors to set the fields
-- abstract void method
	displayBookInfo()
*/
public abstract class Book implements KnowledgeBank {

    String name;
    String author;
    public Book(String name,String author){
        this.name=name;
        this.author=author;
    }
    public abstract void displayBookInfo();

    @Override
    public void takeNote() {
        System.out.println("take the note ");
    }

    @Override
    public void showTableOfContent() {
        System.out.println("Table of Content "+name+"...."+author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
