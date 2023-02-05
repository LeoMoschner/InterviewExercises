package Lean;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Given a String, you should return another string with the format:
 * x[a]a[xc]
 * String input = aabbcc , should return 2[a]2[b]2[c]
 **/
public class LettersInverseBrackets {
    public static void main (String[] args) {
        String line = "aaaaabbbcccd";
        System.out.println(solution2(line));
    }
    public static String solution (String line){
        StringBuilder output = new StringBuilder();
        line = line.toLowerCase();
        int length = line.length();
        int counter = 1;
        char previousLetter = line.charAt(0);
        for (int i = 1; i < length; i++){
            previousLetter = line.charAt(i);
            char actualLetter = line.charAt(i+1);
            if (previousLetter == actualLetter){
                counter++;
            }else{
                output.append(counter + "[" + previousLetter + "]");
                counter = 1;
            }
        }
        output.append(counter + "[" + previousLetter + "]");
        return output.toString();
    }
    public static String solution2(String line){
        String regex = "([a-zA-Z])\\1*";
        StringBuilder output = new StringBuilder();
        Matcher matcher = Pattern.compile(regex).matcher(line);
        while(matcher.find()){
            String sameLetters = matcher.group();
            String unitLetterWithBrackets = "[" + sameLetters.charAt(0) + "]";
            output.append(sameLetters.length() + unitLetterWithBrackets);
        }
        return output.toString();
    }
}
