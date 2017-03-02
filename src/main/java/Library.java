import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>(Arrays.asList(new Book("Bill","Dr. Bill", 2001, out),
                                         new Book("TDD", "Some guy", 1993, out),
                                         new Book("Refactoring", "Some lady", 1693, out)));
    }

    public void listBooks(){
        for (Book book : books) {
            book.showDetails();
        }
    }
}
