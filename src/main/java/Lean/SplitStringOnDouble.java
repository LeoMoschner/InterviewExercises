package Lean;

import java.util.Arrays;

/**
 * * String asdfGGkjcl, split it on the doubled symbol and print length of both strings
 */
public class SplitStringOnDouble {
    public static void main (String[] args){
        String line = "asdfGGjclasd";
        solution(line);
    }
    public static void solution (String line){
        String regex = "([a-zA-Z])\\1";
        String[] aux = line.split(regex);
        Arrays.stream(aux).forEach(substring -> {
            System.out.println(substring + ": " + substring.length());
        });
    }
}
