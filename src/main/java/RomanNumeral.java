import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {

    private Map<Integer, String> ROMAN_CONSTANTS;

    public RomanNumeral() {
        this.ROMAN_CONSTANTS = new LinkedHashMap<Integer, String>();
        initializeHash();
    }

    public String evaluate(int number) {
        String romanNumeral = "";
        for(Map.Entry<Integer, String> romanEntry : ROMAN_CONSTANTS.entrySet()) {
            Integer times = number / romanEntry.getKey();
            romanNumeral += StringUtils.repeat(romanEntry.getValue(), times);
            number -= romanEntry.getKey() * times;
        }
        return romanNumeral;
    }

    private void initializeHash() {
        ROMAN_CONSTANTS.put(1000, "M");
        ROMAN_CONSTANTS.put(900, "CM");
        ROMAN_CONSTANTS.put(500, "D");
        ROMAN_CONSTANTS.put(400, "CD");
        ROMAN_CONSTANTS.put(100, "C");
        ROMAN_CONSTANTS.put(90, "XC");
        ROMAN_CONSTANTS.put(50, "L");
        ROMAN_CONSTANTS.put(40, "XL");
        ROMAN_CONSTANTS.put(10, "X");
        ROMAN_CONSTANTS.put(9, "IX");
        ROMAN_CONSTANTS.put(5, "V");
        ROMAN_CONSTANTS.put(4, "IV");
        ROMAN_CONSTANTS.put(1, "I");
    }
}
