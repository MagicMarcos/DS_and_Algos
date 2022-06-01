package com.algorithms;

public class BinaryConvert {
    final static int OCTAL_NUMBER_BASE = 8;

    public static void main(String[] args){
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
        number = convertFromOctal("17");
        System.out.println("Number for octal 17: " + number);
    }

    public static int convertFromBinary(String binary){
        int conversion = 1;
        int result = 0;
        // decrement from last element
        for (int i = binary.length()-1; i>=0; i-- ){
            System.out.println("i is " + i);
            if (binary.charAt(i) == '1'){
                result += conversion;
            }
            conversion *= 2;
        }
        return result;
    }

    public static int convertFromOctal(String octal) {
        // implement here, return decimal int converted from octal String
            // -> valid octal ints are 1,2,3,4,5,6,7 each multi by 8
        int conversion = 1; // equivalent to 8^0
        int result = 0;

        for(int i = octal.length()-1 ; i  >= 0 ; i--) {
            int parsedInt = getParsedInt(octal, i);  // char to string to number
            result += parsedInt * conversion;
            conversion *= OCTAL_NUMBER_BASE; // octals are multiplied by 8
        }

        return result;
    }

    private static int getParsedInt(String octal, int i) {
        return Integer.parseInt(String.valueOf(octal.charAt(i)), OCTAL_NUMBER_BASE);
    }

    private static int convertToIntegerValue(String toBeConvertedString, int baseNumber) {
        int resultIntegerValue =0;

        int conversion = 1; // equivalent to 8^0

        for(int i = toBeConvertedString.length()-1 ; i  >= 0 ; i--) {
            int parsedInt = getParsedInt(toBeConvertedString, i);
            resultIntegerValue += parsedInt * conversion;
            conversion *= baseNumber;
        }

        return resultIntegerValue;
    }
}
