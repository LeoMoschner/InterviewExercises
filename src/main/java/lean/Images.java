package lean;

import java.util.Arrays;

public class Images {

    public static void main(String[] args) {

        int[][] test =
                {{1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 0}};

        System.out.println(Arrays.toString(imagePositions(test)));
    }
    public static int[] imagePositions(int[][] inputMatrix){
        int[] result = new int[4];
        for (int i = 0; i < inputMatrix.length; i++){
            for (int j = 0; j < inputMatrix[0].length; j++){
                if (inputMatrix[i][j] == 0){
                    result[0] = i;
                    result[1] = j;
                    while (j < inputMatrix[0].length && inputMatrix[i][j] == 0){
                        j++;
                    }
                    while (i < inputMatrix.length && inputMatrix[i][j - 1] == 0){
                        i++;
                    }
                    result[2] = i - 1;
                    result[3] = j - 1;
                    return result;
                }
            }
        }
        System.out.println("No 0s were found in the matrix");
        return result;
    }

}
