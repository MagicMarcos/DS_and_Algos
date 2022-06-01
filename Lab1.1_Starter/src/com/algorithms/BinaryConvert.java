package com.algorithms;

public class BinaryConvert {
    public static void main(String[] args) {
        int number = convertBinaryStringToInteger("100101"); //"100101" -> 32,0,0,4,0,1 -> 37
        System.out.println("Number for binary 100101: " + number);
    }

    public static int convertBinaryStringToInteger(String binary) {
        int result = 0; // track final sum
        int currentMultiplier = 1; // keep track of current multiple

        // loop backwards in the string
        for(int i = binary.length() -1 ; i >=0 ; i -- ) {

            // conditional checks if current char is 1 or 0
            if(binary.charAt(i) == '1') { //use single quotes for chars (not double)
                result += currentMultiplier; //add to result if binary char is 1
            }
            currentMultiplier *= 2; //update multiplier
        }

        // return calculated decimal int converted from String binary
        return result;
    }
}
