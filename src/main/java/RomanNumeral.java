import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private Map<Integer, String> ROMAN_CONSTANTS;

    public RomanNumeral() {
        this.ROMAN_CONSTANTS = new HashMap<Integer, String>();
        initializeHash();
    }

    public String evaluate(int number) {
        return String.valueOf(ROMAN_CONSTANTS.get(number));
    }

    private void initializeHash() {
        ROMAN_CONSTANTS.put(1, "I");
        ROMAN_CONSTANTS.put(5, "V");
        ROMAN_CONSTANTS.put(10, "X");
    }
}
