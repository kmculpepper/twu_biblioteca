import java.awt.datatransfer.StringSelection;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class Library {

    private List<String> books;
    private PrintStream out;

    public Library(PrintStream out) {
        this.out = out;
        this.books = new ArrayList<String>(Arrays.asList("Bill", "TDD", "Refactoring"));
    }

    public void listBooks(){
        String libraryBooks = "";
        for (String book : books) {
            libraryBooks += book + "\n";
        }

        out.println(libraryBooks);
    }
}
