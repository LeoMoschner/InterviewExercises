package lean;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

public class LettersBrackets {

    public static void main(String[] args) {

        String input = "23[asd]";
        String inputTwo = "2[a]3[b]";
        String inputThree = "21[a]10[b05[c]]";

        //System.out.println(multiplyLetters(input));
        System.out.println(multiplyLetters3(inputThree));
        System.out.println(inputThree);
    }
    public static String multiplyLetters(String line){
        String word = line.replaceAll("[^A-Za-z]", "");
        Integer multiplier = Integer.valueOf(line.replaceAll("[^0-9]", ""));
        String output = word.repeat(multiplier);
        return output;
    }

    public static String multiplyLetters2(String line){
        String regex = "[0-9]+\\[[A-Za-z]+\\]";
        Matcher matcher = Pattern.compile(regex).matcher(line);
        StringBuilder output = new StringBuilder();
        while (matcher.find()){
            System.out.println(matcher.group());
            output.append(multiplyLetters(matcher.group()));
        }
        System.out.println(output);
        return output.toString();
    }
    public static String multiplyLetters3(String line){
        String regex = "[0-9]+\\[[A-Za-z]+\\]";
        Pattern pat = Pattern.compile(regex);
        Matcher matcher = pat.matcher(line);
        while (matcher.find()){
            String replacement = multiplyLetters(matcher.group());
            line = line.replace(matcher.group(), replacement);
            matcher = pat.matcher(line);
        }
        return line;
    }
    public static String lettersMultipliedI(String input){
        //for this first case i will use 2 indexes because i will need to get
        //the opening and closing brackets.
        int open, close;
        open = input.indexOf("[");
        close = input.indexOf("]");
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

    public static String lettersMultiplieIII(String input) {
        int open, close;
        String openBracket = "[";
        while (input.contains(openBracket)) {
            open = input.lastIndexOf(openBracket);
            close = input.indexOf("]", open);
            String middleWord = input.substring(open + 1, close);
            int numberStartIndex = open - 1;
            while (numberStartIndex >= 0 && Character.isDigit(input.charAt(numberStartIndex))){
                numberStartIndex--;
            }
            System.out.println("ASD: " + input.substring(numberStartIndex, open - 1));
            int times = Character.getNumericValue(input.charAt(open - 1));
            input = input.replace(input.substring(open - 1, close + 1),
                    middleWord.repeat(times));
        }
        return input;

    }

}
