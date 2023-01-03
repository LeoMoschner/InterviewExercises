package Lean;

import java.util.*;

/**
 * Given an int array return true if two elements sum equals a given target
 *
 * */
public class TargetSum {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        List<Integer[]> output = solution2(inputArray, 7);
        output.forEach(pair -> {
            System.out.println(Arrays.toString(pair));
        });
    }
    public static List<Integer[]> solution(int[] inputArray, int target){
        int length = inputArray.length;
        List<Integer[]> output = new ArrayList<>();
        for (int i = 0; i < length - 1; i++){
            for (int j = i + 1; j < length; j++){
                if (inputArray[i] + inputArray[j] == target){
                    Integer[] outputAux = new Integer[2];
                    outputAux[0] = i;
                    outputAux[1] = j;
                    output.add(outputAux);
                }
            }
        }
        return output;
    }
    public static List<Integer[]> solution2(int [] inputArray, int target){
        Map<Integer, Integer> auxMap = new HashMap<>();
        List<Integer[]> result = new ArrayList<>();
        int length = inputArray.length;
        for (int i = 0; i < length; i++){
            auxMap.put(inputArray[i], i);
            int neededValue = target - inputArray[i];
            if (auxMap.containsKey(neededValue)){
                Integer[] outputAux = new Integer[2];
                outputAux[0] = i;
                outputAux[1] = auxMap.get(neededValue);
                result.add(outputAux);
            }
        }
        return result;
    }
}
