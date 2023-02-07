package Lean;
/**
 * Given a number sum all its digits
 * Example:
 *      input = 123
 *      output = 6
 *      because: 1 + 2 + 3 = 6;
 * */
public class SumNumOfInts {
    public static void main(String[] args) {
        int test = 123;
        System.out.println(solution(test));
        System.out.println(test);
    }
    public static int solution(int number){
        int result = 0;
        while (number > 0){
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
