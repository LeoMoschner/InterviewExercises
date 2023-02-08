package lean;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * array con numeros, hay que decir si hay o no repetidos
 * */
public class RepeatedNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 1};
        System.out.println(solution(numbers));
    }
    public static boolean solution(int[] inputArray){
        Set<Integer> auxSet = new HashSet<>();
        for (int i = 0; i < inputArray.length; i++){
            Integer number = inputArray[i];
            if (auxSet.contains(number)){
                System.out.println(Arrays.toString(inputArray) + " has repeated numbers");
                return true;
            }else{
                auxSet.add(number);
            }
        }
        System.out.println(Arrays.toString(inputArray) + " has not repeated numbers");
        return false;
    }
}
