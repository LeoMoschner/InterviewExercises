package Leo;

public class ReverseNumber {

    // # Given a signed 32-bit integer x  (-2.140.000.001 hasta 2.140.000.000),
    // return x with its digits reversed. If reversing
    // x causes the value to go outside the signed 32-bit integer range [-231,  a  231-1], then return 0.
    // # Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

// # Example 1:
// # Input: x = 321
// # Output: 123  tiene que ser 0

// # Example 2:
// # Input: x = -123
// # Output: -321    0

// # Example 3:
// # Input: x = 120
// # Output: 21

// # Constraints:
// # -231 <= x <= 231 - 1

    //  if( -231 <= x <= 231 - 1) return 0;


    public static void main(String[] args) {

        int input2 = -232;
        System.out.println(rever(input2) );
    }

    public static int rever(int numb) {
        int answer = 0;
        boolean flag = false;

        if (numb < 0) {
            numb = numb * -1;
            flag = true;
        }

        while (numb > 0) {
            if (flag && answer * 10 > 230 || !flag && answer * 10 > 231) {
                return 0;
            } else {
                answer = answer * 10 + numb % 10;
                numb = numb / 10;
            }
        }
        if (answer <= -231 || answer > 230) return 0;
        return (flag) ? answer * -1 : answer;
    }
}
