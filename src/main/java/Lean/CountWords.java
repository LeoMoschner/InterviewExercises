package Lean;

import java.util.HashMap;
import java.util.Map;

/**
 * Contar todas las palabras de un string
 * */
public class CountWords {
    public static void main (String[] args){
        String line = "Hello Word!!! And also hello to you and yOu. woRd,";
        System.out.println(solution(line));
    }
    public static Map<String, Integer> solution(String line){
        Map<String, Integer> result = new HashMap<>();
        line = line.replaceAll("[^a-zA-Z ]", "");
        line = line.toUpperCase();
        String[] aux = line.split(" ");
        for (String word: aux){
            if (result.containsKey(word)){
                result.put(word, result.get(word) + 1);
            }else{
                result.put(word, 1);
            }
        }
        return result;
    }
}
