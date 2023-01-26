package Leo;

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
            // First i will create a doble for loop to iterate throw i & j
            // in the j loop i will call some method that will make the check
            // finally print if It's, or it's not anagram.

        String line = "123 456 231 546 312 4556";
        solution2(line);
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
    public static boolean isAnagram (String first, String second){
        char [] firstNumber = first.toCharArray();
        char [] secondNumber = second.toCharArray();
        Arrays.sort(firstNumber);
        Arrays.sort(secondNumber);
        return Arrays.equals(firstNumber, secondNumber);
    }
    public static void anagramNumbers(String number) {

        //i will create a string array with the string number i receive, using split.
        String[] numbers = number.split(" ");

        List <String> anagrams = new ArrayList<>();
        List <String> notAnagrams = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                // Here i will call the method
                if (isAnagram(numbers[i], numbers[j])) {
                    anagrams.add(numbers[i] + " and " + numbers[j]);
                } else {
                    notAnagrams.add(numbers[i] + " and " + numbers[j]);
                }
            }
        }

        System.out.println("the list of angrams" + anagrams);
        System.out.println("the list of not anagrams" + notAnagrams);

    }
    // this method will receive 2 strings (the two numbers to compare).
    //create 1 char array for each one, just to sort them using Arrays.sort
    //finally return using equals.




}
