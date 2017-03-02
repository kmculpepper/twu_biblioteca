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

    @Before
    public void setUp() {

    }

    @Test
    public void shouldDisplayWelcomeMessageOnStart() {
        PrintStream out = mock(PrintStream.class);

        Application application = new Application(out);
        application.start();

        verify(out).println("Welcome!");
    }


}
