package com.demott;

public class ReverseString {

    /**
     * Recursive method to reverse string.
     * 
     * @param inputString
     *            String that will be reversed
     * @return reversed string
     */
    static String reverseRecursively(String inputString) {
        ReverseString reverseString = new ReverseString();
        return reverseString.reverseRecursively(inputString, "");
    }

    private String reverseRecursively(String inputString, String subString) throws NullPointerException {

        if (inputString == null) {
            throw new NullPointerException("A null String was passed in.  A String is expected.");
        }

        // base case to handle zero or one size Strings because nothing would need to be reversed.
        if ((inputString.length() < 2) && (subString.length() == 0)) {
            return inputString;
        }

        if (inputString.length() == 0) {
            return subString;
        }

        subString = subString + inputString.substring(inputString.length() - 1, inputString.length());
        inputString = inputString.substring(0, inputString.length() - 1);
        return reverseRecursively(inputString, subString);
    }

    public static void main(String[] args) {
        String reversedString = ReverseString.reverseRecursively("abcdefghijklmnopqrstuvwxyz");
        System.out.println(reversedString);
    }

}
