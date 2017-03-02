import java.io.PrintStream;

/**
 * Created by MarcoBarragan on 3/2/17.
 */
public class Book {
    private final String title;
    private final String author;
    private final int year;
    private PrintStream out;

    public Book(String title, String author, int year, PrintStream out) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.out = out;
    }

    public void showDetails() {
        out.println(title + "\t" + author + "\t" + year);
    }
}
