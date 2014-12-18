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
            Integer i = number / romanEntry.getKey();
            romanNumeral += StringUtils.repeat(romanEntry.getValue(), i);
            number -= romanEntry.getKey()*i;
        }
        return romanNumeral;
    }

    private void initializeHash() {
        ROMAN_CONSTANTS.put(10, "X");
        ROMAN_CONSTANTS.put(5, "V");
        ROMAN_CONSTANTS.put(1, "I");
    }
}
