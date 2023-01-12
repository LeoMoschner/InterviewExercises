package Leo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortInsertion {


    public static void main(String[] args) {

        Map<String, Integer> menu = new HashMap<>();
        menu.put("coffee", 100);
        menu.put("cake", 200);
        menu.put("popcorn", 225);
        int coins = 400;

        List<String> combinations = new ArrayList<>();

        // 1
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            combinations.add(entry.getKey());
        }

        // 2
        Map<String, Integer> aux = new HashMap<>();
        aux.putAll(menu);

        // 3
        for (String name : combinations) {
            aux.remove(name);
            int result = 0;

            // sumamos los valores del mapa auxiliar a result
            for (Map.Entry<String, Integer> entr : aux.entrySet()) {
                result = result + entr.getValue();
            }

            // si es menor a coins imprimimos
            if (result <= coins) {
                for (Map.Entry<String, Integer> e : aux.entrySet()) {
                    System.out.print(e.getKey() + " ");
                }
            }
            System.out.println("-----------------");

            // regresamos aux a su estado original.
            aux.putAll(menu);
        }

    }
}

