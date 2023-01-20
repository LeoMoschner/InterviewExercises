package Lean;

import java.util.Arrays;
public class SortInsertion {
    public static void main(String[] args) {
        int[] test = {20, 15, 13, 1, 5, 10};
        System.out.println(Arrays.toString(insertionSort(test)));
    }
    public static int[] insertionSort (int[] inputArray){
        int length = inputArray.length;
        for (int i = 1; i < length; i++){
            int j = i;
            while (j > 0 && inputArray[j] < inputArray[j - 1]){
                int auxSwap = inputArray[j];
                inputArray[j]  = inputArray[j - 1];
                inputArray[j - 1] = auxSwap;
                j--;
            }
        }
        return inputArray;
    }

}

