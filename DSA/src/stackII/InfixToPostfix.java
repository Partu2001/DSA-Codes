package stackII;

import java.util.Stack;

public class InfixToPostfix {

    // Function to check precedence
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

            default:
                return -1;
        }
    }

    // Function to convert infix to postfix
    static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            switch (ch) {

                // Operand
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':

                    while (!stack.isEmpty() &&
                           precedence(stack.peek()) >= precedence(ch)) {
                        postfix += stack.pop();
                    }
                    stack.push(ch);
                    break;

                case '(':
                    stack.push(ch);
                    break;

                case ')':
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix += stack.pop();
                    }
                    if (!stack.isEmpty()) {
                        stack.pop(); // Remove '('
                    }
                    break;

                default:
                    postfix += ch; // Operand
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        return postfix;
    }

    public static void main(String[] args) {
        String infix = "A+B*(C-D)";
        String postfix = infixToPostfix(infix);

        System.out.println("Infix   : " + infix);
        System.out.println("Postfix : " + postfix);
    }
}