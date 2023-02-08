package lean;

import java.util.Stack;

public class CorrectOpenAndClose {
    /**
     * String input = "[(]{)}()"
     * see if every time there is open bracket, there is a closed one after,
     * and never a closed one before an open one
     * extra: implement for () too
     */
    public static void main(String[] args) {
        String input = "{[(3 + 2)(2 % 4)]}";
        System.out.println(justOneCharII('(', ')', input));
    }
    public static boolean solution(String inputString){
        Stack<Character> opens = new Stack<>();
        if (inputString.length() % 2 != 0){
            return false;
        }
        for (int i = 0; i < inputString.length(); i++){
            char unit = inputString.charAt(i);
            if (unit == '(' || unit == '[' || unit == '{'){
                opens.push(unit);
                continue;
            }
            if (opens.isEmpty()){
                return false;
            }
            switch (unit){
                case ']':
                    if (opens.pop() != '['){
                        return false;
                    }
                    break;
                case ')':
                    if (opens.pop() != '('){
                        return false;
                    }
                    break;
                case '}':
                    if (opens.pop() != '{'){
                        return false;
                    }
                    break;
                default:
                    System.out.println("Skipping not brackets character: " + unit);
            }
        }
        return (opens.isEmpty());
    }
    public static boolean justOneChar(char openChar, char closeChar, String input){
        if (!(input.length() % 2 == 0)) return false;
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (x == openChar) {
                myStack.push(x);
                continue;
            }
            if (myStack.empty()) return false;
            if ( x== closeChar) myStack.pop();
        }
        return (myStack.isEmpty());
    }
    public static boolean justOneCharII(char openChar, char closeChar, String input){
        String regex = ("[^" + openChar  + closeChar +"]");
        String auxInput = input.replaceAll(regex, "");
        if ((auxInput.length() % 2 == 1)) return false;
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < auxInput.length(); i++) {
            char x = auxInput.charAt(i);
            if (x == openChar) {
                myStack.push(x);
                continue;
            }
            if (myStack.empty()) return false;
            myStack.pop();
        }
        return (myStack.isEmpty());
    }
}
