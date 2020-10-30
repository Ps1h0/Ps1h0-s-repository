package Lab42;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;


class Lab22Test {

    @Test
    void correct() throws IOException {
        FileReader fr = new FileReader(Lab22.publicToPrivate("C:\\Users\\plato\\OneDrive\\Desktop\\task2.txt"));
        int b;
        String tmp = "";
        boolean x = true;
        while ((b = fr.read()) != -1) {
            if ((char) b == ' ') {
                if (tmp.equals("public"))
                    x = false;
                tmp = "";
            } else if ((char) b == '\n') {
                tmp = "";
            } else
                tmp += (char) b;
        }
        assertTrue(x);
    }

    @Test
    void emptyFile() throws IOException {
        FileReader fr = new FileReader(Lab22.publicToPrivate("C:\\Users\\plato\\OneDrive\\Desktop\\empty.txt"));
        int b = 0;
        String tmp = "";
        boolean x = false;
        if ((b = fr.read()) == -1) {
            x = true;
        }
        assertTrue(x);
    }
}