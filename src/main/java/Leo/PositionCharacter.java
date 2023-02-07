package Leo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PositionCharacter {

    /**
     * Devolver las posiciones en las que aparece cada letra de un string.
     * */



public static void main(String [] args){

    String word = "asdasdlgk";
    wordsPositions(word
    );

}


public static void wordsPositions(String input){

    char [] inputChar = input.toCharArray();

    Map<Character, String> pos = new HashMap<>();

    for(int i = 0; i<inputChar.length; i++){

        if(pos.containsKey(inputChar[i])){
            pos.put(inputChar[i], pos.get(inputChar[i]) + " " + i);
        }else {
            pos.put(inputChar[i], String.valueOf(i));
        }
    }
    System.out.println(pos);

    for (Map.Entry let : pos.entrySet()){
        System.out.println("The character: "+ let.getKey() + " is on positions: " + let.getValue());

    }

}
}
