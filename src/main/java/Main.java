import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class Main {

    public static void main (String [] args){
        PrintStream out = System.out;
        ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(new Book("Bill","Dr. Bill", 2001, out),
                new Book("TDD", "Some guy", 1993, out),
                new Book("Refactoring", "Some lady", 1693, out)));
        Library lib = new Library(books);
        Application application = new Application(out, lib);
        application.start();
    }
}
