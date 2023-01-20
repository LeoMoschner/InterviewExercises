package Lean;

import java.util.Arrays;
public class SortSelection {
    public static void main(String[] args) {
        int [] test = {3, 4, 7, 1, 2};
        System.out.println(Arrays.toString(selectionSort(test)));
    }
    public static int[] selectionSort(int[] inputArray){
        int length = inputArray.length;
        for (int i = 0; i < length - 1; i++){
            int minorValue = inputArray[i];
            int minorIndex = i;
            for (int j = i + 1; j < length;  j++){
                if (inputArray[j] < minorValue){
                    minorValue = inputArray[j];
                    minorIndex = j;
                }
            }
            int auxSwap = inputArray[i];
            inputArray[i] = inputArray[minorIndex];
            inputArray[minorIndex] = auxSwap;
        }
        return inputArray;
    }
}
