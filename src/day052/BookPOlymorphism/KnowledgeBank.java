package day052.BookPOlymorphism;

public interface KnowledgeBank {
    public abstract void takeNote();

    public default void showTableOfContent(){

    }

}
