package com.dtcc.quiz;

public class LoopFun {
    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     *
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number) {
        long fact = 1;
        int i = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }
        return (int) fact;
    }

    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     *
     * @param phrase
     * @return Upper case string of the first letter of each word
     */

    public String acronym(String phrase) {
        String acro = "";
        String[] arr = phrase.split(" ");
        for (int i = 0; i < arr.length; i++) {
            acro += arr[i].charAt(0) + "";
        }
        return acro.toUpperCase();

    }

    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     * 'a' => 'd'
     * 'w' => 'z'
     * 'x' => 'a'
     * 'y' => 'b'
     *
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public String encrypt(String word) {
        char[] encry = word.toCharArray();
        char[] result = new char[encry.length];
        int j = 0;
        for (int i = 0; i < encry.length; i++) {
            int ascii = (int) encry[i];
            if(ascii >= 97 && ascii < 120) {
                result[j] = (char) (ascii + 3);
                j++;
            }
            if(ascii >= 120 && ascii <= 122) {
                ascii -= 26;
                result[j] = (char)(ascii+3);
                j++;
            }
        }
        return new String(result);}
}

