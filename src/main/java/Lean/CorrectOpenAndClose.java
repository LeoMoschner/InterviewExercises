package Lean;

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
        System.out.println(solution(input));
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
}
