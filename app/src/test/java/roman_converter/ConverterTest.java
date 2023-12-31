/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package roman_converter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class ConverterTest {
    private Converter converter;

    @BeforeEach
    public void doBefore() {
        converter = new Converter();
    }

    @Test
    public void shouldConvert_1_2_3() throws Exception {
        assertEquals(1, converter.convert("I"));
        assertEquals(2, converter.convert("II"));
        assertEquals(3, converter.convert("III"));
    }

    @Test
    public void shouldConvert_5_10() throws Exception {
        assertEquals(5, converter.convert("V"));
        assertEquals(10, converter.convert("X"));
    }

    @Test
    public void shouldConvert_4() throws Exception {
        assertEquals(4, converter.convert("IV"));
    }

    @Test
    public void shouldConvert_9() throws Exception {
        assertEquals(9, converter.convert("IX"));
    }

    @Test
    public void shouldCovert_6_7_8() throws Exception {
        assertEquals(6, converter.convert("VI"));
        assertEquals(7, converter.convert("VII"));
        assertEquals(8, converter.convert("VIII"));
    }

    @Test
    public void shouldConvert_50() throws Exception {
        assertEquals(50, converter.convert("L"));
    }

    @Test
    public void shouldConvert_40() throws Exception {
        assertEquals(40, converter.convert("XL"));
    }

    @Test
    public void shouldConvert_60_70_80() throws Exception {
        assertEquals(60, converter.convert("LX"));
        assertEquals(70, converter.convert("LXX"));
        assertEquals(80, converter.convert("LXXX"));
    }

    @Test
    public void shouldConvert_100() throws Exception {
        assertEquals(100, converter.convert("C"));
    }

    @Test
    public void shouldConvert_90() throws Exception {
        assertEquals(90, converter.convert("XC"));
    }

    @Test
    public void shouldConvert_500() throws Exception {
        assertEquals(500, converter.convert("D"));
    }

    @Test
    public void shouldConvert_400() throws Exception {
        assertEquals(400, converter.convert("CD"));
    }

    @Test
    public void shouldConvert_600_700_800() throws Exception {
        assertEquals(600, converter.convert("DC"));
        assertEquals(700, converter.convert("DCC"));
        assertEquals(800, converter.convert("DCCC"));
    }

    @Test
    public void shouldConvert_1000() throws Exception {
        assertEquals(1000, converter.convert("M"));
    }

    @Test
    public void shouldConvert_900() throws Exception {
        assertEquals(900, converter.convert("CM"));
    }

    @Test
    public void shouldConvert_20_30() throws Exception {
        assertEquals(20, converter.convert("XX"));
        assertEquals(30, converter.convert("XXX"));
    }

    @Test
    public void shouldConvert_200_300() throws Exception {
        assertEquals(200, converter.convert("CC"));
        assertEquals(300, converter.convert("CCC"));
    }

    @Test
    public void shouldConvert_2000_3000() throws Exception {
        assertEquals(2000, converter.convert("MM"));
        assertEquals(3000, converter.convert("MMM"));
    }

    @Test
    public void shouldConvert_54_82() throws Exception {
        assertEquals(54, converter.convert("LIV"));
        assertEquals(82, converter.convert("LXXXII"));
    }

    @Test
    public void shouldConvert_99_199_2999() throws Exception {
        assertEquals(99, converter.convert("XCIX"));
        assertEquals(199, converter.convert("CXCIX"));
        assertEquals(2999, converter.convert("MMCMXCIX"));
    }
}
