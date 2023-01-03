package Lean;

public class FizzBuzz {
    public static void main(String[] args) {
        solution(100);
    }

    public static void solution(int range){
        for (int i = 0; i < range; i++){
            StringBuilder aux = new StringBuilder();
            boolean aux1 = false;
            aux.append(i + ": ");
            if (i % 3 == 0){
                aux.append("Fizz");
                aux1 = true;
            }
            if (i % 5 == 0){
                aux.append("Buzz");
                aux1 = true;
            }
            if (aux1){
                System.out.println(aux);
            }
        }
    }
}
