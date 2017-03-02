import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class LibraryTest {

    @Test
    public void shouldHaveAListOfBooks(){
        Library library = new Library();

        List<String> listOfBooks = new ArrayList<String>();
        listOfBooks.add("Bill");
        listOfBooks.add("TDD");
        listOfBooks.add("Refactoring");

        assertTrue(listOfBooks.containsAll(library.getBooks()));
    }
}
