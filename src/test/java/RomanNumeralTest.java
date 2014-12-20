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
    public void oneShouldReturnI() {
        assertThat(rmPrinter.evaluate(1), is("I"));
    }

    @Test
    public void fiveShouldReturnV() {
        assertThat(rmPrinter.evaluate(5), is("V"));
    }

    @Test
    public void tenShouldReturnX() {
        assertThat(rmPrinter.evaluate(10), is("X"));
    }

    @Test
    public void thirtyFiveShouldReturnXXXV() {
        assertThat(rmPrinter.evaluate(35), is("XXXV"));
    }

    @Test
    public void nineHundredNinetySixShouldReturnCMXCVI() {
        assertThat(rmPrinter.evaluate(996), is("CMXCVI"));
    }

    @Test
    public void fourHundredFortyFourshouldReturnCDXLIV() {
        assertThat(rmPrinter.evaluate(444), is("CDXLIV"));
    }
}
