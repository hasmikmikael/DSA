import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private final List<Character> leftBrackets = Arrays.asList('(', '[', '{', '<');
    private final List<Character> rightBrackets = Arrays.asList(')', ']', '}', '>');

    // Exercise - Balanced Expressions.
    // Whether the pairs and orders of
    // brackets ()[]{}<> are correct in the String?
    public boolean isBalanced(String input) {
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
        // return ch == '(' || ch == '[' || ch == '{' || ch == '<';
        return leftBrackets.contains(ch);
    }

    private boolean isRight(char ch) {
        // return ch == ')' || ch == ']' || ch == '}' || ch == '>';
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right) {
        // (, [, {, <
        // ), ], }, >
        return leftBrackets.indexOf(left) == rightBrackets.indexOf((right));
//        return (right == ')' && left != '(') ||
//                (right == ']' && left != '[') ||
//                (right == '}' && left != '{') ||
//                (right == '>' && left != '<');
    }
}
