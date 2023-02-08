package lean;

import java.util.Arrays;

public class SortQuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] swap(int[] inputArray, int left, int right){
        int auxSwap = inputArray[left];
        inputArray[left] = inputArray[right];
        inputArray[right] = auxSwap;
        return inputArray;
    }
    public static int partition(int[] inputArray, int low, int high){    // low y high es el rango del subarray que queremos hacer partition
        int pivot = inputArray[high];
        int i = low - 1;        //why
        for (int j = low; j < high; j++){
            if (inputArray[j] < pivot){
                i++;
                swap(inputArray, i, j);
            }
        }
        /**
         * Cuando salgo del ciclo for tengo en i la posicion del ultimo elemento mas chico que el pivot que encontre.
         * Por eso, si swapeo pivot con i + 1 tengo a la izq del pivot todos los mas chicos y a la derecha todos los mas grandes
         * */
        swap(inputArray, i + 1, high);
        return i + 1;
    }

    public static void quickSort(int[] inputArray, int low, int high){
        if (low < high){
            int pivot = partition(inputArray, low, high);
            quickSort(inputArray, low, pivot - 1);
            quickSort(inputArray, pivot + 1, high);
        }
    }
}
