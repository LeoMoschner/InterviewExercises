package lean;

import java.util.HashMap;
import java.util.Map;

/**
 * Devolver las posiciones en las que aparece cada letra de un string.
 * */

public class CharacterPositionInString {
    public static void main (String[] args){
        String line = "Hello Word";
        System.out.println(solution(line));
    }
    public static Map<Character, String> solution (String line){
        line = line.replace(" ", "");
        line = line.toUpperCase();
        Map<Character, String> output = new HashMap<>();
        for (int i = 0; i < line.length(); i++){
            Character letter = line.charAt(i);
            if (output.containsKey(letter)){
                String aux = output.get(letter) + " - " +  i;
                output.put(letter, aux);
            }else {
                output.put(letter, String.valueOf(i));
            }
        }
        return output;
    }
}
