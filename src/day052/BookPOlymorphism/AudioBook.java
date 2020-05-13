package day052.BookPOlymorphism;

public class AudioBook extends Book{
    double duration;

    public void listen(){
        System.out.println("Listen the book");
    }

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Author is "+author+ " Name of Book is "+ name+" Duration "+duration);
    }

    @Override
    public void takeNote() {
        System.out.println("Take about this audio book ");
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
