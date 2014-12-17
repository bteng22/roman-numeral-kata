public class RomanNumeral {


    private String ROMAN_SINGLE = "I";

    public String evaluate(int number) {
        String romanPhrase = "";
        for(int i = 1; i <= number; i++) {
            if(i <= number) {
                romanPhrase += ROMAN_SINGLE;
            }
        }
        return romanPhrase;
    }
}
