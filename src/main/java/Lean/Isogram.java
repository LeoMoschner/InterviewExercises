package Lean;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

    /**
     An isogram is a word that has no repeating letters, consecutive or non-consecutive.
     Implement a function that determines whether a string that contains only letters is an isogram.
     Assume the empty string is an isogram. Ignore letter case.
     */

    public static void main(String[] args) {
        String line = "asd zxc s";
        System.out.println(solutionRegex(line));
    }
    public static boolean solution(String line){
        line = line.replaceAll("[^A-Za-z]", "").toUpperCase();
        int length = line.length();
        if (length < 1) return true;
        Set<Character> aux = new HashSet<>();
        for (int i = 0; i < length; i++){
            Character letter = line.charAt(i);
            if (aux.contains(letter)){
                return false;
            }else{
                aux.add(letter);
            }
        }
        return true;
    }
    public static boolean solutionRegex(String line){
        line = line.replaceAll("[^A-Za-z]", "").toLowerCase();
        if (line.length() < 1) return true;
        String regex = "[a-zA-Z]*([a-zA-Z])[a-zA-Z]*\\1";
        return !line.matches(regex);
    }
}
