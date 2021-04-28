import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    String p0,p1,p2,p3,p4,p5;

    @BeforeEach
    void setUp() {
        p0="aca";
        p1="200";
        p2="";
        p3="aaabccbaaa";
        p4="ahabccbaaa";
        p5="La tele letal";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void validarPal0() {
        assertTrue(Main.validarPal(p0));
        assertTrue(Main.validarPal(p2));
        assertTrue(Main.validarPal(p3));
        assertTrue(Main.validarPal(p5));

    }

    @Test
    void validarPal1() {
        assertFalse(Main.validarPal(p1));
        assertFalse(Main.validarPal(p4));
    }


}