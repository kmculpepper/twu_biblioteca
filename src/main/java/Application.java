import java.io.PrintStream;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class Application {

    private PrintStream out;
    private Library library;

    public Application(PrintStream out) {

        this.out = out;
        this.library = new Library(out);
    }

    public void start() {
        out.println("Welcome!");
        library.listBooks();
    }


}
