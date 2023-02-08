package lean;

import java.util.HashMap;
import java.util.Map;

/**
 * Contar todas las letras de un string
 * */
public class CountLetters {
    public static void main (String[] args){
        String line = "Hello Word!!!";
        System.out.println(solution(line));
        System.out.println(line);
    }
    public static Map<Character, Integer> solution (String line){
        Map<Character, Integer> output = new HashMap<>();
        line = line.replaceAll("[^a-zA-Z]", "");
        line = line.toUpperCase();
        for (int i = 0; i < line.length(); i++){
            Character letter = line.charAt(i);
            if (output.containsKey(letter)){
                output.put(letter, output.get(letter) + 1);
            }else{
                output.put(letter, 1);
            }
        }
        return output;
    }
}
