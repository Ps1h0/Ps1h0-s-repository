package Lab41;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;


public class Lab21Test {

    @Test
    public void testSearchRight() {
        String[] b = {"abc", "cde"};
        String a = Lab21.search(b);
        Assertions.assertEquals("abc cde", a);

    }

    @Test
    public void testSearchEmpty() {
        String[] b = new String[]{""};
        String a = Lab21.search(b);
        Assertions.assertEquals("", a);
    }

    @Test
    public void testSearchThreeWords() {
        String[] b = new String[]{"abc", "cde", "efg"};
        String a = Lab21.search(b);
        Assertions.assertEquals("abc cde cde efg", a);
    }

}
