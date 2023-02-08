package lean;

import java.util.HashMap;
import java.util.Map;

//given a String determine if it can be rearranged as a palindrome
public class RearrangePalindrome {
    public static void main(String[] args) {
        String line = "aaaabbbbcccd";
        System.out.println(solution(line));
    }
    public static boolean solution(String line){
        Map<Character, Integer> auxMap = new HashMap<>();
        int length = line.length();
        int oddsLettersCounter = 0;
        for (int i = 0; i < length; i++){
            Character letter = line.charAt(i);
            if (auxMap.containsKey(letter)){
                auxMap.put(letter, auxMap.get(letter) + 1);
            }else{
                auxMap.put(letter, 1);
            }
        }
        for (Integer value: auxMap.values()){
            if (value % 2 == 1) oddsLettersCounter++;
        }
        return (oddsLettersCounter < 2);
    }
}
