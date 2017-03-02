import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by MarcoBarragan on 3/2/17.
 */
public class BookTest {

    @Test
    public void shouldDisplayBookDetails() {
        PrintStream out = mock(PrintStream.class);
        Book book = new Book("Bill", "Dr. Bill", 2001, out);
        book.showDetails();

        verify(out).println("Bill\tDr. Bill\t2001");

    }

}