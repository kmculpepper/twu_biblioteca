import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by MarcoBarragan on 3/1/17.
 */
public class LibraryTest {


    @Test
    public void shouldDisplayAListOfBooks() {
        Library library = new Library(out);
        library.listBooks();

        verify(out).println(contains("Bill\nTDD\nRefactoring"));
    }

//    @Test
//    public void shouldDisplayBookDetailsWhenListingBooks() {
//        PrintStream out = mock(PrintStream.class);
//        Library library = new Library(out);
//        library.listBooks();
//
//        verify(out).println(contains("Bill\tDr. Bill\t2001"));
//    }
}
