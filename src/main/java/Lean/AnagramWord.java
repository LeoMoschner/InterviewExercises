package Lean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, return true if they are Anagram
 * or False if it's not an Anagram.
 * An Anagram is a word, phrase, or name formed by rearranging the letters of another.
 * Example spar is formed from rasp.
 */
public class AnagramWord {
    public static void main(String[] args) {
        String firstWord = "holaa";
        String secondWord = "laosh";

//        System.out.println(isAnagram(firstWord, secondWord));
//        System.out.println(isAnagramMapI(firstWord, secondWord));
        System.out.println(isAnagramMapIII(firstWord, secondWord));
    }

    //For this exercises i have several ways to solved it
    //I'm thinking that first i can ask if the lenght are the same, if not return false.

    public static boolean isAnagram(String first, String second) {

        //The easy way will be to create to char arrays,
        //Then use the method Arrays.sort and return the Arrays.equals method

        if (first.length() != second.length()) return false;

        char[] firstAux = first.toCharArray();
        char[] secondAux = second.toCharArray();

        Arrays.sort(firstAux);
        Arrays.sort(secondAux);
        return Arrays.equals(firstAux, secondAux);
    }

    //Using map i think of 2 ways: one, using the same sort than before and then
    // using a for loop, overload two maps. Then use equals method to return.
    //Second way, inside a for loop overload 2 maps asking if it has the key and
    //adding value.
    public static boolean isAnagramMapI(String first, String second) {
        if (first.length() != second.length()) return false;

        Map<Integer, Character> firstMap = new HashMap<>();
        Map<Integer, Character> secondMap = new HashMap<>();

        char[] firstAux = first.toCharArray();
        char[] secondAux = second.toCharArray();
        Arrays.sort(firstAux);
        Arrays.sort(secondAux);
        Arrays.equals(firstAux, secondAux);

        for (int i = 0; i < firstAux.length; i++) {
            firstMap.put(i, firstAux[i]);
            secondMap.put(i, secondAux[i]);
        }
        System.out.println(firstMap);
        System.out.println(secondMap);
        return firstMap.equals(secondMap);
    }
    public static boolean isAnagramMapII(String first, String second) {
        if (first.length() != second.length()) return false;

        Map<Character, Integer> firstAux = new HashMap<>();
        Map<Character, Integer> secondAux = new HashMap<>();

        for (int i = 0; i < first.length(); i++) {
            if (firstAux.containsKey(first.charAt(i))) {
                firstAux.replace(first.charAt(i), firstAux.get(first.charAt(i)) + 1);
            } else {
                firstAux.put(first.charAt(i), 1);
            }
            if (secondAux.containsKey(second.charAt(i))) {
                secondAux.replace(second.charAt(i), secondAux.get(second.charAt(i)) + 1);
            } else {
                secondAux.put(second.charAt(i), 1);
            }
        }
        System.out.println(firstAux);
        System.out.println(secondAux);
        return firstAux.equals(secondAux);
    }

    /**
     * Using only one map
     * */
    public static boolean isAnagramMapIII(String first, String second){
        if (first.length() != second.length()) return false;
        Map<Character, Integer> auxMap = new HashMap<>();
        for (int i = 0; i < first.length(); i++){
            Character firstWordLetter = first.charAt(i);
            Character secondWordLetter = second.charAt(i);
            if (auxMap.containsKey(firstWordLetter)){
                auxMap.put(firstWordLetter, auxMap.get(firstWordLetter) + 1);
            }else{
                auxMap.put(firstWordLetter, 1);
            }
            if (auxMap.containsKey(secondWordLetter)){
                auxMap.put(secondWordLetter, auxMap.get(secondWordLetter) - 1);
            }else{
                auxMap.put(secondWordLetter, -1);
            }
        }
        for (Integer value: auxMap.values()){
            if (value != 0) return false;
        }
        return true;
    }
}
