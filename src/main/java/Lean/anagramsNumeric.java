package Lean;

import java.util.*;

public class anagramsNumeric {
    /**
     * Input:
     * String line = "123 456 231 546 231 312 4556";
     * <p>
     * Output:
     * 123, 231, 231, 312 - are numeric anagrams
     * 456, 546 - are numeric anagrams
     * 4556 - has no anagrams
     **/
    public static void main(String[] args) {
        String line = "123 456 231 546 231 312 4556";
        solution(line);
    }
    public static void solution (String line){
        List<String> numbers = new ArrayList<>();
        Collections.addAll(numbers, line.split(" "));
        for (int i = 0; i < numbers.size(); i++){
            StringBuilder outputAux = new StringBuilder(numbers.get(i));
            boolean hasAnagrams = false;
            for (int j = 0; j < numbers.size(); j++){
                if (i != j && areAnagrams(numbers.get(i), numbers.get(j))){
                    outputAux.append(", ");
                    outputAux.append(numbers.get(j));
                    numbers.remove(j--);
                    hasAnagrams = true;
                }
            }
            if (hasAnagrams){
                outputAux.append(" - are numeric anagrams");
                numbers.remove(i--);
            }else{
                outputAux.append(" - has no anagrams");
            }
            System.out.println(outputAux);
        }
    }
    public static boolean areAnagrams (String firstNumber, String secondNumber){
        char[] firstAux = firstNumber.toCharArray();
        char[] secondAux = secondNumber.toCharArray();
        Arrays.sort(firstAux);
        Arrays.sort(secondAux);
        return (Arrays.equals(firstAux, secondAux));
    }

    public static void solution2(String line){
        String[] splitted = line.split(" ");
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < splitted.length; i++){
            char[] solution = splitted[i].toCharArray();
            Arrays.sort(solution);
            String sorted = new String(solution);
            if(map.containsKey(sorted)){
                String aux = map.get(sorted);
                aux = aux + " "  + splitted[i];
                map.put(sorted,aux);
            }else{
                map.put(sorted,splitted[i]);
            }
        }
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
            if (entry.getValue().split(" ").length>1){
                System.out.println("Are numeric anagrams");
            }else {
                System.out.println("Has no anagrams");
            }
        }
    }
}


