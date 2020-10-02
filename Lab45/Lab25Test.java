package Lab45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Lab25Test {
    @Test
    void isEmpty(){
        String b = "";
        String a = Lab25.nums(b);
        assertEquals("", a);
    }

    @Test
    void noNums(){
        String b = "abcdffedhth";
        String a = Lab25.nums(b);
        assertEquals("", a);
    }

    @Test
    void correctRes(){
        String b = "a1b12c123d1234";
        String a = Lab25.nums(b);
        assertEquals("1234", a);

    }
}