import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class Library {

    private List<Book> books = new ArrayList<Book>();

    public List<Book> getBooks() {
        books.add(new Book("Bill", "Dr. Bill", 2001));
        books.add(new Book("TDD", "Some guy", 1993));
        books.add(new Book("Refactoring", "Some lady", 1659));
        return books;
    }
}
