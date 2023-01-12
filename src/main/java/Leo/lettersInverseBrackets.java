package Leo;

/**
 * Given a String, you should return another string with the format:
 * x[a]a[xc]
 * String input = aabbcc , should return 2[a]2[b]2[c]
 **/
public class lettersInverseBrackets {


    public static void main(String[] args) {
        String input = "s";
        String inputTwo = "assb";
        System.out.println(inverseStuff(input));
    }

    public static StringBuilder inverseStuff(String input) {
        StringBuilder newString = new StringBuilder();
        int counter = 1;
        char actualLetter = input.charAt(0);
        char previousLetter;

        for (int i = 0; i < input.length() - 1; i++) {
            previousLetter = input.charAt(i - 1);
            actualLetter = input.charAt(i);
            if (actualLetter != previousLetter) {
                newString.append(counter + "[" + previousLetter + "]");
                counter = 1;
            } else {
                counter++;
            }
        }
        newString.append(counter + "[" + actualLetter + "]");

        return newString;
    }

}
