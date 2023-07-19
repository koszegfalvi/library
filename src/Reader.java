import java.util.HashSet;
import java.util.Set;

public class Reader {
    Set<Reader>readers=new HashSet<>();
    String readerName;
    String readerTicket;
    String readerPreferency;
    int borrowedBooksDate;
    int actualDate;

    public Reader(Set<Reader> readers, String readerName, String readerTicket, String readerPreferency) {
        this.readers = readers;
        this.readerName = readerName;
        this.readerTicket = readerTicket;
        this.readerPreferency = readerPreferency;
    }


}
