import java.io.PrintStream;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class Application {

    private PrintStream out;

    public Application(PrintStream out) {

        this.out = out;
    }

    public void start() {
        out.print("Welcome!");
    }

    public void printBooks(Library library) {
        String books = "";
        for (Book book : library.getBooks()) {
            books += book + "\n";
        }

        out.println(books);
    }

}
