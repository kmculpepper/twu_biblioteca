import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class Application {

    private PrintStream out;
    private Library library;

    public Application(PrintStream out) {

        this.out = out;
        this.library = new Library(new ArrayList<Book>(Arrays.asList(new Book("Bill","Dr. Bill", 2001, out),
                new Book("TDD", "Some guy", 1993, out),
                new Book("Refactoring", "Some lady", 1693, out))));
    }

    public void start() {
        out.println("Welcome!");
        library.listBooks();
    }


}
