import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {
    private Book book;
    @Before
    public void before(){
        book = new Book("Denial Is Not A River In Egypt", "Sandi Bachom","Medicine",1998);
    }
    @Test
    public void hasTitle(){
        assertEquals("Denial Is Not A River In Egypt", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Sandi Bachom",book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Medicine", book.getGenre());
    }

    @Test
    public void hasDate(){
        assertEquals(1998,book.getDate(),0.0);
    }

}