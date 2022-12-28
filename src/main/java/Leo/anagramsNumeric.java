package Leo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        String name = "hola como andas";
        String line = "123 456 231 546 231 312 4556";
        anagramNumbers(line);
    }
    public static void anagramNumbers(String number) {
        String[] numbers = number.split(" ");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (isAnagram(numbers[i], numbers[j])) {
                    System.out.println(numbers[i] + " and " + numbers[j] + " Are anagrams");
                } else {
                    System.out.println(numbers[i] + " and " + numbers[j] + " Are not anagrams");
                }
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



}
