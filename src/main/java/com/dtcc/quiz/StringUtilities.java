package com.dtcc.quiz;

public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {

        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        char ch[]=valueToBeReversed.toCharArray();
        String result = "";
        for(int i = valueToBeReversed.length()-1; i >= 0; i--){
          result += ch[i];

        }
        return result;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int wordLength = word.length();
        if(wordLength % 2 == 0){
            return word.charAt(wordLength/2);
        }
        return word.charAt(wordLength/2);

    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
//        char[] c = value.toCharArray();
        return value.replaceAll(String.valueOf(charToRemove),"");
        }


    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] arr = sentence.split(" ");
        return arr[arr.length - 1];

    }
}
