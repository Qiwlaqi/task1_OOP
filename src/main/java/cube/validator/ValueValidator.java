package main.java.cube.validator;

import java.util.regex.Pattern;

public class ValueValidator {
    private static final String REGEX_RESULT = "-?[-]?[0-9]*[.,]?[0-9]+\\s+-?[-]?[0-9]*[.,]?[0-9]+\\s+"
            + "[-]?[0-9]*[.,]?[0-9]+\\s+[-]?[0-9]*[.,]?[0-9]+";

    public boolean isDouble(String value) {
        return Pattern.matches(REGEX_RESULT, value);
    }
}