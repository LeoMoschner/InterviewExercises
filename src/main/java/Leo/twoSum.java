package Leo;

import java.util.*;

public class twoSum {
    //return las dos posiciones de ints que sumen un target
    //input: array de ints y target

    public static void main(String[] args) {
    int [] myArray = {3, 5, 1, 3, 7, 10};
    positions(myArray, 8);
    }
    public static List<Integer[]> positions (int[] numbers, int target){
        List<Integer[]> myList = new ArrayList<>();
        Map<Integer, Integer> mapNumbers = new HashMap<>();

        for(int i=0; i<numbers.length; i++){
            mapNumbers.put(numbers[i], i);
            if(mapNumbers.containsKey(target-numbers[i])){
                Integer [] auxArray= new Integer[2];
                auxArray[0]= i;
                auxArray[1] = mapNumbers.get(target-numbers[i]);
                myList.add(auxArray);
            }
        }
        myList.stream().forEach(numerito->
                System.out.println(Arrays.toString(numerito)));

        return myList;
    }


}
