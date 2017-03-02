import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Matchers.contains;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class ApplicationTest {


    private PrintStream out;
    private Application application;
    private Library lib;

    @Before
    public void setUp() {
        out = mock(PrintStream.class);
        lib = mock(Library.class);

        application = new Application(out, lib);
    }

    @Test
    public void shouldDisplayWelcomeMessageOnStart() {
        application.start();

        verify(out).println("Welcome!");
    }

    @Test
    public void shouldDisplayListBooksOptionWhenMenuIsDisplayed(){
        application.selectMenuOption();

        verify(out).println(contains("List Books"));
    }


}
