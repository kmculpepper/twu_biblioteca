import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class Application {

    private PrintStream out;
    private Library library;

    public Application(PrintStream out, Library library) {

        this.out = out;
        this.library = library;
    }

    public void start() {
        out.println("Welcome!");
        library.listBooks();
    }


    public void selectMenuOption() {
        out.println("List Books");
    }
}
