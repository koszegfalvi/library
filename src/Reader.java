import java.util.HashSet;
import java.util.Set;

public class Reader extends Library {
    Set<Reader> reader = new HashSet<>();
    Set<Reader>borrowedBooks=new HashSet<>();
    String readerName;
    String readerTicket;
    String readerPreferency;
    int borrowedBooksDate;
    int actualDate;

    public Reader(String title, String author, String publishDate, String category, int quantity) {
        super(title, author, publishDate, category, quantity);
    }


    public void borrowBook(Reader book) {
        reader.add(book);
        borrowedBooks.add(book);
        book.quantity--;
    }

    public void giveBackBook(Reader book) {
        reader.remove(book);
        // itt a kölcsönzöttekből nem veszem ki, hogy meg tudjam , a múltban miket kölcsönzött
        book.quantity++;
    }
    private void borrowedBook(Reader reader){
        System.out.println(borrowedBooks);
    }
    private void howLongBorrowed(Reader book){
        System.out.println();  ////???????
    }

}



