package Lean;

import java.util.HashSet;
import java.util.Set;

/**
* Check that all elements of an array are unic.
 * */
public class UniqueArrayElements {
    public static void main(String[] args) {
        int [] input = {1, 2, 3, 3};
        System.out.println(solution(input));
    }
    public static boolean solution(int[] input){
        Set<Integer> aux = new HashSet<>();
        int length = input.length;
        for (int i = 0; i < length; i++){
            if (aux.contains(input[i])){
                return false;
            }else{
                aux.add(input[i]);
            }
        }
        return true;
    }
}
