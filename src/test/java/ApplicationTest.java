import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class ApplicationTest {


    private PrintStream out;
    private Application application;
    private Library lib;
    private BufferedReader in;

    @Before
    public void setUp() {
        out = mock(PrintStream.class);
        lib = mock(Library.class);
        in = mock(BufferedReader.class);

        application = new Application(in, out, lib);
    }

    @Test
    public void shouldDisplayWelcomeMessageOnStart() {
        application.start();

        verify(out).println("Welcome!");
    }

    @Test
    public void shouldDisplayListBooksOptionWhenMenuIsDisplayed() throws IOException {
        application.selectMenuOption();

        verify(out).println(contains("List Books"));
    }

    @Test
    public void shouldTakeInOneInputWhenMenuIsDisplayed() throws IOException {
        application.selectMenuOption();

        verify(in, times(1)).readLine();
    }


    @Test
    public void shouldListBooksWhenMenuOptionIsSelected() throws IOException {
        application.selectMenuOption();
        when(in.readLine()).thenReturn("1");

        verify(lib).listBooks();
    }

    @Test
    public void shouldNotListBooksWhenNotListBooksOptionIsSelected() throws IOException {
        application.selectMenuOption();
        when(in.readLine()).thenReturn("2");
        verify(lib, times(0)).listBooks();
    }

}
