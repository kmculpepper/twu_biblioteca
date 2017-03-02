import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Matchers.contains;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class ApplicationTest {

    @Before
    public void setUp() {

    }

    @Test
    public void shouldDisplayWelcomeMessageOnStart() {
        PrintStream out = mock(PrintStream.class);

        Application application = new Application(out);
        application.start();

        verify(out).print("Welcome!");
    }

    @Test
    public void shouldDisplayLibraryBooksWhenContainsMultipleBooks(){
        PrintStream out = mock(PrintStream.class);
        Library library = new Library();

        Application application = new Application(out);
        application.printBooks(library);

        verify(out).println(contains("Bill\nTDD\nRefactoring"));
    }

//    @Test
//    public void shouldNotDisplayLibraryBooksWhenLibraryIsEmpty() {
//
//    }

    @Test
    public void shouldDisplayBookDetailsWhenListingLibraryBooks() {
        PrintStream out = mock(PrintStream.class);
        Library library = new Library();

        Application application = new Application(out);
        application.printBooks(library);

        verify(out).println(contains("Bill\tDr. Bill\t2001"));
    }
}
