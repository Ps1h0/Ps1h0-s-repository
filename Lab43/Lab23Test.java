package Lab43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Lab23Test {

    @Test
    void emptyFile(){
        Exception exception = assertThrows(NullPointerException.class, () ->
                Lab23.transpose("C:\\Users\\plato\\OneDrive\\Desktop\\empty.txt"));
        assertEquals(null, exception.getMessage());
    }

}