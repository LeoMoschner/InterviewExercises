package Lean;

import java.util.Arrays;

public class PairsNumbers {
    /**
     * A function called pairs() takes an array, for example [3,1,8].
     * It should return all pairs, e.g. for mentioned example: [[3,1],[3,8],[1,8]].
     *
     **/
    public static void main(String[] args) {
        int[] inputArray = {3, 1, 8, 0, 11};
        System.out.println(Arrays.deepToString(pairs(inputArray)));
    }
    public static int[][] pairs(int[] inputArray){
        int inputLength = inputArray.length;
        int outputLength = ((inputLength * inputLength) - inputLength) / 2;
        int[][] output = new int[outputLength][2];
        int oRows = 0;
        for (int i = 0; i < inputLength - 1; i++){
            for (int j = i + 1; j < inputLength; j++){
                output[oRows][0] = inputArray[i];
                output[oRows][1] = inputArray[j];
                oRows++;
            }
        }
        return output;
    }

}
