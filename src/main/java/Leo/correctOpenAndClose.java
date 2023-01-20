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
        String inputTwo = "()[]{(())}{()}";
        String inputThree = "(({[))]}))";
        String inputFour = "{}[]()()";
        String inputFelipe = "{(}[]())()";
        //System.out.println(openAndCloseAll(inputFelipe));

        System.out.println(justOneChar('[', ']', inputThree));

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

    public static boolean justOneChar(char openChar, char closeChar, String input){
        if (!(input.length() % 2 == 0)) return false;
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (x == openChar) {
                myStack.push(x);
                continue;
            }else {
                if(x !=openChar && x!=closeChar) continue;
            }

            if (myStack.empty()) return false;
            if ( x== closeChar) myStack.pop();
            }

        return (myStack.isEmpty());

    }
}
