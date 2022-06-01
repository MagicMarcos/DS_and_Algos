package com.algorithms;

import static org.junit.Assert.*;

public class BinaryConvertTest {

    @org.junit.Test
    public void convertFromBinary_should_return_valid_integer_given_valid_binary_string() {
        String givenStringOfBinaryValues = "01101";
        int expectResult= 13;
        assertEquals(BinaryConvert.convertFromBinary(givenStringOfBinaryValues), expectResult);
    }

    @org.junit.Test
    public void convertFromOctal_should_return_valid_integer_given_valid_octal_string_array() {
        String givenStringOfOctalValues = "77";
        int expectedResult = 63;
        assertEquals(BinaryConvert.convertFromOctal(givenStringOfOctalValues), expectedResult);
    }

    @org.junit.Test
    public void convertFromOctal_should_throw_NumberFormatException_given_invalid_octal_string() {
        String givenStringOfOctalValues = "7s";
        try {
            BinaryConvert.convertFromOctal(givenStringOfOctalValues);
        } catch (MyNumberFormatException exception) {
            assertEquals(givenStringOfOctalValues, exception.getMessage());
        }

    }

    @org.junit.Test (expected = MyNumberFormatException.class)
    public void _convertFromOctal_should_throw_MyNumberFormatException_given_octal_string_with_non_number_chars() throws MyNumberFormatException {
        BinaryConvert.convertFromOctal("17a");
    }

    @org.junit.Test (expected = MyNumberFormatException.class)
    public void convertFromOctal_should_throw_AssertionError_given_invalid_octal_string_greater_than_7() {
        String givenStringOfOctalValues = "87";
        BinaryConvert.convertFromOctal(givenStringOfOctalValues);
    }
}