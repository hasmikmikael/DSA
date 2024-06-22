import java.util.Stack;

public class Stacks {
    // Exercise - Reversing a String.
    public String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

//        for (int i = 0; i < input.length(); i++)
//            stack.push(input.charAt(i));

        for (char ch : input.toCharArray())
            stack.push(ch);

        StringBuffer reversed = new StringBuffer();
        while (!stack.empty())
            reversed.append(stack.pop());

        return reversed.toString();
    }

    // Exercise - Balanced Expressions.
    // Whether the pairs and orders of
    // brackets ()[]{}<> are correct in the String?
    public boolean isBalancedExpression(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeft(ch))
                stack.push(ch);

            if (isRight(ch)) {
                if (stack.empty()) return false;
                var top = stack.pop();
                if (bracketsMatch(top, ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeft(char ch) {
        return ch == '(' || ch == '[' || ch == '{' || ch == '<';
    }

    private boolean isRight(char ch) {
        return ch == ')' || ch == ']' || ch == '}' || ch == '>';
    }

    private boolean bracketsMatch(char left, char right) {
        return (right == ')' && left != '(') ||
                (right == ']' && left != '[') ||
                (right == '}' && left != '{') ||
                (right == '>' && left != '<');
    }
}
