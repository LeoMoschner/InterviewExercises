package Aleksi;

/**
 * 3. Given this input: "3[asd]" you have to generate an output string: asdasdasd
 * # Q1
 * ## input => "2[asd]"
 * ## output => "asdasdasd"
 * # Q2
 * ## input => "3[a]4[b]"
 * ## output => "aaabbbb"
 * # Q3
 * ## input => "3[a2[b]]"
 * ## interim output => "3[abb]"
 * ## output => "abbabbabb" (edited)
 */

public class lettersBrackets {

    public static void main(String[] args) {

        String input = "2[asd]";
        String inputTwo = "2[a]2[b]";
        String inputThree = "2[a]2[b2[c]]";
        System.out.println(lettersMultipliedI(input));
        //System.out.println(lettersMultiplieII(inputTwo));
    }

    public static String lettersMultipliedI(String input){
        //for this first case i will use 2 indexes because i will need to get
        //the opening and closing brackets.
        int open, close;
        open = input.indexOf("[");
        close = input.indexOf("]");

        System.out.println(open);
        System.out.println(close);
        //now i have to multiply what are inside the open and close, with the number
        String middleWord = input.substring(open+1, close);
        input= middleWord.repeat(Character.getNumericValue(input.charAt(open-1)));
        return input;
    }

    public static String lettersMultiplieII(String input) {
        int open, close;
        String openBracket = "[";
        //For resolving the third case, i just need to change the open integer method.
        // open=input.lastIndexOf(openBracket);
        while (input.contains(openBracket)) {
            open = input.indexOf(openBracket);
            close = input.indexOf("]", open);

            String middleWord = input.substring(open + 1, close);

            input = input.replace(input.substring(open - 1, close + 1),
                    middleWord.repeat(Character.getNumericValue(input.charAt(open - 1))));
        }
        return input;

    }

}
