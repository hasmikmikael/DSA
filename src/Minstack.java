import java.util.Arrays;

public class Minstack {
    // Design a stack that supports push, pop and retrieving the minimum
    // value in constant time.
    // For example, we populate our stack with [5, 2, 10, 1] (from left to right).
    // stack.min() // 1
    // stack.pop()
    // stack.min() // 2

    Stack stack = new Stack();
    Stack minStack = new Stack();

    public void push(int item) {
        stack.push(item);

        if (minStack.isEmpty())
           minStack.push(item);
        else if (item < minStack.peek())
           minStack.push(item);
    }

    public int pop() {
        if (stack.isEmpty())
            throw new IllegalStateException();

        var top = stack.pop();

        if (top == minStack.peek())
            minStack.pop();

        return top;
    }

    public int min() {
        return minStack.peek();
    }
}
