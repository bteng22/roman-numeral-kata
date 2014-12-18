import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralTest {

    private RomanNumeral rmPrinter;

    @Before
    public void setUp() throws Exception {
        rmPrinter = new RomanNumeral();
    }

    @Test
    public void oneShouldReturnRomanNumeralI() {
        assertThat(rmPrinter.evaluate(1), is("I"));
    }

    @Test
    public void fiveShouldReturnRomanNumeralV() {
        assertThat(rmPrinter.evaluate(5), is("V"));
    }

    @Test
    public void tenShouldReturnRomanNumeralX() {
        assertThat(rmPrinter.evaluate(10), is("X"));
    }

}
