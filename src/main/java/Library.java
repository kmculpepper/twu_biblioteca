import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class Library {

    private List<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void listBooks(){
        for (Book book : books) {
            book.showDetails();
        }
    }
}
