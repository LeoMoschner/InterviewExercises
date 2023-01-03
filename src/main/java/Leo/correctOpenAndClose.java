package Leo;

import java.util.Stack;

public class correctOpenAndClose {
    /**
     * String input = "[(]{)}()"
     * see if every time there is open bracket, there is a closed one after,
     * and never a closed one before an open one
     * extra: implement for () too
     */

    public static void main(String[] args) {
        String input = "()[])(";
        String inputTwo = "()[]{(()()}{)}";
        String inputThree = "(({[]}))";
        String inputFour = "{}[]()()";
        System.out.println(openAndClose(inputTwo));
        System.out.println(openAndClose(inputThree));
        System.out.println(openAndClose(inputFour));

    }


    //This solution works only with a order input. Not work for "))(("
    public static boolean openAndClose(String input) {
        if (!(input.length() % 2 == 0)) return false;

        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                myStack.push(x);
                continue;
            }

            if (myStack.empty()) return false;

            switch (x) {
                case ')':
                    if (myStack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (myStack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (myStack.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
        return (myStack.isEmpty());
    }
}
