package Lab41;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Lab21Test {

    @Test
    public void testSearchRight() {
        String[] b = {"abc", "cde"};
        String a = Lab21.search(b);
        assertEquals("abc cde", a);

    }
    @Test
    public void testSearchEmpty(){
        String[] b = new String[]{""};
        String a = Lab21.search(b);
        assertEquals("", a);
    }
    @Test
    public void testSearchThreeWords(){
        String[] b = new String[]{"abc", "cde", "efg"};
        String a = Lab21.search(b);
        assertEquals("abc cde cde efg", a);
    }

}
