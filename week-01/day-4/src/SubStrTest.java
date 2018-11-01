import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubStrTest {

    @Test
    void testFirstCharMathches() {
        int index = SubStr.subStr("asd", "a");
        assertEquals(0, index);
    }

    @Test
    void testFirstTwoCharMathches() {
        int index = SubStr.subStr("asd", "as");
        assertEquals(0, index);
    }

    @Test
    void testSecondCharMathches() {
        int index = SubStr.subStr("aasd", "s");
        assertEquals(2, index);
    }

    @Test
    void testSecondTwoCharMatches() {
        int index = SubStr.subStr("asd", "sd");
        assertEquals(1, index);
    }

    @Test
    void testSecondTwoCharMath() {
        int index = SubStr.subStr("aasd", "as");
        assertEquals(1, index);
    }

    @Test
    void testNoMatch() {
        int index = SubStr.subStr("asdfg", "hj");
        assertEquals(-1, index);
    }

    @Test
    void test1() {
        assertEquals(-1, SubStr.subStr("asdf", "fd"), "1");
    }

    @Test
    void test2() {
        assertEquals(0, SubStr.subStr("asdfasd", "asd"), "2");
    }


    @Test
    void test3() {
        assertEquals(2, SubStr.subStr("asasd", "asd"), "3");
    }

    @Test
    void test4() {
        assertEquals(-1, SubStr.subStr("fgas", "asd"), "4");
    }

    @Test
    void test5() {
        assertEquals(4, SubStr.subStr("dbcaab", "ab"), "4");
    }

    @Test
    void test6() {
        assertEquals(3, SubStr.subStr("abcdef", "def"), "4"); //f után ha írok valami, kiakad, valószínűleg tovább olvasna inputból
    }

}