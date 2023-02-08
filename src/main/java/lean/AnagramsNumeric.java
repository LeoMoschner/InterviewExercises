package lean;

import java.util.*;

public class AnagramsNumeric {
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
        solution2(line);
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

    /**
     * I will split the input line in order to get an array of all numbers.
     * I will create a map with the following logic <String, String>
     *     Key: sorted number (if two numbers are anagrams they are going to be sorted in the same way Ex: 231, 321 will be 123)
     *     Value: the numbers that are anagrams.
     * To do so:
     *      1. Iterate over the String array where I got all my numbers
     *      2. Sort each number, to do that I transform the String into a char array to be able to use the Arrays.sort method.
     *      3. Then I ask for the sorted number as key
     *          3.1 If Contains -> I concatenate my number (not sorted) to the values of that key.
     *          3.2 Not Contains -> I put my sorted number as a key and my number not sorted as value.
     *
     *      4. Once I Iterate the whole String Array. I will have my map completed with the previous mention structure:
     *              <Sorted Number, All numbers that sorted are equals (they are anagrams)
     *      5. All I have to do now is iterate over the map
     *          5.1 I have to ask for how many numbers do I have in values
     *                  Because: if I have only one number I will print "has no numeric anagrams" in the end
     *                          If I have more than one number i will print "are numeric anagrams" in the end.
     *
     *               To do so: I will split my values into a Sring[] and ask for length
     *                  Example:
     *                  Key: 123
     *                  Value: "123 231 312"
     *                  Length: 3
     *                  So I will print: 123, 231, 213 are numeric anagrams
     * */
    public static void solution2(String line){
        String[] splitted = line.split(" ");
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < splitted.length; i++){
            char[] sortedAux = splitted[i].toCharArray();
            Arrays.sort(sortedAux);
            String sortedNumber = new String(sortedAux);
            if(map.containsKey(sortedNumber)){
                String aux = map.get(sortedNumber);
                aux = aux + " "  + splitted[i];
                map.put(sortedNumber,aux);
            }else{
                map.put(sortedNumber,splitted[i]);
            }
        }
        for (String numbers: map.values()){
            System.out.print(numbers);
            if (numbers.split(" ").length > 1){
                System.out.print(" - are numeric anagrams\n");
            }else{
                System.out.println(" - has no anagrams\n");
            }
        }
    }
}


