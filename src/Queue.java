import java.util.ArrayDeque;
import java.util.Stack;

public class Queue {
    // Exercise - Reversing a Queue.
    public static void reverse(java.util.Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
