import java.util.EmptyStackException;
import java.util.Stack;

public class QueueWithTwoStacks {
    // Q  [10, 20, 30]
    // S1 [10, 20, 30]
    // S2 [30, 20, 10]
    private Stack<Integer> stack1 = new Stack(); // enqueue
    private Stack<Integer> stack2 = new Stack(); // dequeue

    // O(1)
    public void enqueue(int item) {
        stack1.push(item);
    }

    // O(n)
    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
}
