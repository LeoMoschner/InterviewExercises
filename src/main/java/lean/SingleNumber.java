package lean;

import java.util.HashSet;
import java.util.Set;

/**
 *  * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *  * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *  * Example 1:
 *  * Input: nums = [2,2,1]
 *  * Output: 1
 */
public class SingleNumber {
    public static void main(String[] args){
        int[] inputArray = {5,2,5,3,3};
        System.out.println(solution2(inputArray));
    }
    public static int solution(int[] inputArray){
        Set<Integer> auxSet = new HashSet<>();
        int length = inputArray.length;
        int output = 0;
        for (int i = 0; i < length; i++){
            Integer number = inputArray[i];
            if (auxSet.contains(number)){
                //return number;
            }else{
                auxSet.add(number);
                output = number;
            }
        }
        return output;
    }

    /**
     * XOR of a number with itself is 0.
     * XOR of a number with 0 is number itself.
     *
     * Let us consider the above example.
     *
     * res = 7 ^ 3 ^ 5 ^ 4 ^ 5 ^ 3 ^ 4
     *
     * Since XOR is associative and commutative, above
     * expression can be written as:
     *
     * res = 7 ^ (3 ^ 3) ^ (4 ^ 4) ^ (5 ^ 5)
     *     = 7 ^ 0 ^ 0 ^ 0
     *     = 7 ^ 0
     *     = 7
     *
     *     https://www.geeksforgeeks.org/find-element-appears-array-every-element-appears-twice/
     * */
    public static int solution2(int[] inputArray){
        int result = inputArray[0];
        for (int i = 1; i < inputArray.length; i++){
            System.out.print(result + " XOR " + inputArray[i] + "= ");
            result = result ^ inputArray[i];
            System.out.println(result);
        }
        return result;
    }
}
