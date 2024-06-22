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
            if (ch == '(' || ch == '[' || ch == '{' || ch == '<')
                stack.push(ch);

            if (ch == ')' || ch == ']' || ch == '}' || ch == '>' ) {
                if (stack.empty()) return false;
                var top = stack.pop();
                if (
                    (ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{') ||
                    (ch == '>' && top != '<')
                ) return false;
            }
        }

        return stack.empty();
    }
}
