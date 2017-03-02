import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class Application {

    private BufferedReader in;
    private PrintStream out;
    private Library library;

    public Application(BufferedReader in, PrintStream out, Library library) {
        this.in = in;
        this.out = out;
        this.library = library;
    }

    public void start() {
        out.println("Welcome!");
        library.listBooks();
    }


    public void selectMenuOption() throws IOException {
        out.println("List Books");
        String option = in.readLine();
        if ("1".equals(option))
            library.listBooks();
    }
}
