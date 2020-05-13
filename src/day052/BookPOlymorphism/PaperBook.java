package day052.BookPOlymorphism;
/*PaperBook
	int weight
	-- add constructor to set all the fileds
	implement abstract method
	instance method
		read()
		toString()
*/
public class PaperBook extends Book implements Readable{
    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    @Override
    public void read() {
        System.out.println("Read the book");
    }

    @Override
    public void takeNote() {
        System.out.println("Take note about "+author+"'s "+name+" book");
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Author is "+author+ " Name of Book is "+ name);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void showTableOfContent() {
        System.out.println("Table of Content "+name+"...."+author+"....."+weight+ " pounds");
    }
}
