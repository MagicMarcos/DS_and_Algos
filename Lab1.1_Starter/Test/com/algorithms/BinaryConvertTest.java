package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryConvertTest {

    @Test
    public void convertBinaryStringToInteger_should_return_valid_integer_given_valid_binary_string() {
        String[] testBinaryStringArray = {"10101101", "10"};
        int[] expectedIntegerValueArray = {173, 2};

        for (int i = 0; i < testBinaryStringArray.length; i++) {
            int resultIntegerValue = BinaryConvert.convertBinaryStringToInteger(testBinaryStringArray[i]);
            assertEquals(expectedIntegerValueArray[i], resultIntegerValue);
        }

    }
}