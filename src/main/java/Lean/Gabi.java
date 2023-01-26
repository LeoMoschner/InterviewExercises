package Lean;
// # Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// # Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

// # Example 1:
// # Input: x = 123
// # Output: 321

// # Example 2:
// # Input: x = -123
// # Output: -321

// # Example 3:
// # Input: x = 120
// # Output: 21

// # Constraints:
// # -231 <= x <= 231 - 1
public class Gabi {
    public static void main (String[] args){
        int number = 232;
        System.out.println(reverse(number));
    }
    public static int reverse(int number){
        int result = 0;
        boolean isNegative = false;
        if (number < 0){
            number *= -1;
            isNegative = true;
        }
        while (number > 0){
            if (isNegative && result * 10 + number > 231 || !isNegative && result * 10 + number > 230){
                System.out.println("Out of range");
                return 0;
            } else {
                result = result * 10 + number % 10;
                number = number / 10;
            }
        }
        return (isNegative) ? result * -1 : result;
    }
}
