package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryConvertTest {

    @Test
    public void convertFromOctalTest() {
        String[] testBinaryStringArray = {"15", "17"};
        int[] expectedIntegerValueArray = {13, 15};

        for (int i = 0; i < testBinaryStringArray.length; i++) {
            int resultIntegerValue = BinaryConvert.convertFromOctal(testBinaryStringArray[i]);
            assertEquals(expectedIntegerValueArray[i], resultIntegerValue);
        }
    }


}