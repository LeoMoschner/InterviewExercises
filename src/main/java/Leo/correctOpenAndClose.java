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
        String inputFelipe = "{(}[]())()";
        System.out.println(openAndCloseAll(inputFelipe));

    }
    public static boolean openAndCloseAll(String input) {
        if (!(input.length() % 2 == 0)) return false;
        Stack<Character> myStack = new Stack<>();
                    //{(}[]())()
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
