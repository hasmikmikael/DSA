import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.Stack;
//import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ************* Big O Notation ******************
        int[] numbers = { 10, 20, 30, 40 };
        log(numbers);

        // ********** Arrays *************************
        array();

        // ********* Array Class ********************
        Array number = new Array(3);
        number.insert(10);
        number.insert(20);
        number.insert(30);
        number.insert(40);
        number.removeAt(2);
        System.out.println(number.indexOf(20));
        System.out.println(number.max());
        number.print();

        Array array = new Array(2);
        array.insert(10);
        array.insert(50);

        Array commonItems = array.intersect(number);
        commonItems.print();

        number.reverse();
        number.print();

        number.insertAt(5, 1);
        number.print();

        // ************* Dynamic Arrays *****************
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list); // [10, 20, 30]
        list.indexOf(20);
        list.lastIndexOf(20);
        list.contains(20);
        list.size(); // 3
        list.remove(0);
        System.out.println(list); // [20, 30]
        list.toArray();

        // ************* Linked Lists ****************
        // linkedList();

        // ********** Building a Linked List **********
        // var linkedList = new LinkedList();
        // linkedList.addLast(10);
        // linkedList.addLast(20);
        // linkedList.addLast(30);
        // linkedList.addLast(40);
        // linkedList.addLast(50);
        // linkedList.addLast(60);
        // linkedList.addFirst(5);
        // System.out.println(linkedList.indexOf(10)); // 1
        // System.out.println(linkedList.contains(10)); // true
        // linkedList.removeFirst();
        // linkedList.removeLast();
        // System.out.println(linkedList.size()); // 2
        // linkedList.reverse();
        // System.out.println(linkedList.getKthFromTheEnd(2)); // 20
        // var arr = linkedList.toArray();
        // System.out.println(Arrays.toString(arr));
        // linkedList.printMiddle(); // 30, 40
        // var listWithLoop = LinkedList.createWithLoop();
        // System.out.println(listWithLoop.hasLoop());

        // *************** Stacks *****************
        // Stack<Integer> stack = new Stack<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack); // [10, 20, 30]
        // var top = stack.pop();
        // System.out.println(top); // 30
        // System.out.println(stack); // [10, 20]
        // top = stack.peek();
        // System.out.println(top); // 20

        String str = "abcd";
        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(str);
        System.out.println(result); // dcba

        // Edge cases
        // (
        // (()
        // ( ]
        // ) (
        String strExp = "((1+2)>";
        Expression exp = new Expression();
        var res = exp.isBalanced(strExp);
        System.out.println(res); // false

        // ******* Building a Stack ***********
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        System.out.println(st); // [10, 20]
        var top = st.peek();
        System.out.println(top); // 20

        // MinStack
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(2);
        minStack.push(10);
        minStack.push(1);
        System.out.println(minStack.min()); // 1
        minStack.pop();
        System.out.println(minStack.min()); // 2

        // ********** Queues ****************
        java.util.Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue); // [10, 20, 30, 40]
        var front = queue.remove();
        System.out.println(front); // 10
        System.out.println(queue); // [20, 30, 40]

        // Reversing a Queue
        // Queue.reverse(queue);
        // System.out.println(queue);// [40, 30, 20]

        // Building a Queue Using an Array
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        System.out.println(arrayQueue); // [10, 20, 30, 0, 0]
        System.out.println(arrayQueue.peek()); // 10
        var frnt = arrayQueue.dequeue();
        System.out.println(frnt); // 10
        System.out.println(arrayQueue); // [0, 20, 30, 0, 0]
        System.out.println(arrayQueue.peek()); // 20
        System.out.println(arrayQueue.isEmpty()); // false
        arrayQueue.dequeue();
        System.out.println(arrayQueue); // [0, 0, 30, 0, 0]
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);
        arrayQueue.enqueue(60);
        System.out.println(arrayQueue); // [60, 0, 30, 40, 50]
        arrayQueue.enqueue(70);
        System.out.println(arrayQueue); // [60, 70, 30, 40, 50]
        // arrayQueue.enqueue(80); // Exception
        arrayQueue.dequeue();
        System.out.println(arrayQueue); // [60, 70, 0, 40, 50]
        arrayQueue.enqueue(80);
        System.out.println(arrayQueue); // [60, 70, 80, 40, 50]

        QueueWithTwoStacks queueWithTwoStacks = new QueueWithTwoStacks();
        queueWithTwoStacks.enqueue(10);
        queueWithTwoStacks.enqueue(20);
        queueWithTwoStacks.enqueue(30);
        var first = queueWithTwoStacks.dequeue();
        System.out.println(first); // 10

        // Priority Queues
        // PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // priorityQueue.add(5);
        // priorityQueue.add(1);
        // priorityQueue.add(3);
        // priorityQueue.add(2);
        // while (!priorityQueue.isEmpty()) {
        // System.out.println(priorityQueue.remove()); // 1 2 3 5
        // }

        // *********** Building a Priority Queue ************
        PriorityQueue prQueue = new PriorityQueue();
        prQueue.add(5);
        prQueue.add(3);
        prQueue.add(6);
        prQueue.add(1);
        prQueue.add(4);
        System.out.println(prQueue); // [1, 3, 4, 5, 6]

        while (!prQueue.isEmpty())
            System.out.println(prQueue.remove()); // 6 5 4 3 1

        // ********** Exercise - Queue Reverser ***************
        java.util.Queue<Integer> que = new ArrayDeque<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);

        QueueReverser queueReverser = new QueueReverser();
        queueReverser.reverseFirstKElements(que, 3);
        System.out.println(que); // [30, 20, 10, 40, 50]

        // ********** Exercise - Building a Queue using Linked List ******
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enqueue(10);
        linkedListQueue.enqueue(20);
        linkedListQueue.enqueue(30);
        linkedListQueue.enqueue(40);
        linkedListQueue.enqueue(50);
        System.out.println(linkedListQueue); // [10, 20, 30, 40, 50]
        var fnt = linkedListQueue.dequeue();
        System.out.println(fnt); // 10
        System.out.println(linkedListQueue); // [20, 30, 40, 50]

        // ********** Exercise - Building a Stack using two Queues *******
        StackWithTwoQueues stackWithTwoQueues = new StackWithTwoQueues();
        stackWithTwoQueues.push(10);
        stackWithTwoQueues.push(20);
        stackWithTwoQueues.push(30);
        stackWithTwoQueues.push(40);
        stackWithTwoQueues.push(50);
        stackWithTwoQueues.push(60);
        System.out.println(stackWithTwoQueues); // [10, 20, 30, 40, 50, 60]
        int pop = stackWithTwoQueues.pop();
        System.out.println(pop); // 60
        System.out.println(stackWithTwoQueues); // [10, 20, 30, 40, 50]

        // *********** Hash Tables ************************
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mosh");
        map.put(2, "John");
        map.put(3, "Mary");
        System.out.println(map); // {1=Mosh, 2=John, 3=Mary}
        map.put(3, "Marianne");
        System.out.println(map); // {1=Mosh, 2=John, 3=Marianne}
        map.put(4, null);
        System.out.println(map); // {1=Mosh, 2=John, 3=Marianne, 4=null}
        map.put(null, null);
        System.out.println(map); // {null=null, 1=Mosh, 2=John, 3=Marianne, 4=null}
        map.remove(null);
        System.out.println(map); // {1=Mosh, 2=John, 3=Marianne, 4=null}
        var value = map.get(3);
        System.out.println(value); // Marianne
        map.containsKey(3); // O(1)
        map.containsValue("Mosh"); // O(n)

        for (var item : map.keySet())
            System.out.println(item);
        // 1
        // 2
        // 3
        // 4

        for (var item : map.entrySet())
            System.out.println(item);
        // 1=Mosh
        // 2=John
        // 3=Marianne
        // 4=null
    }

    public static void log(int[] numbers) {
        // ---------O(1)---------------
        // 0(2) // simplified O(1)
        System.out.println(numbers[0]); // O(1)
        System.out.println(numbers[0]); // O(1)

        // ---------O(n)---------------
        // runtime complexity 0(n)
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);

        // with foreach
        // runtime complexity 0(n)
        for (int number : numbers)
            System.out.println(number);

        // runtime complexity 0(1+n+1)/O(2+n) // simplified O(n)
        System.out.println(); // O(1)
        for (int number : numbers) // O(n)
            System.out.println(number);
        System.out.println(); // O(1)

        // runtime complexity O(n+n) // simplified O(n)
        for (int number : numbers) // O(n)
            System.out.println(number);
        for (int number : numbers) // O(n)
            System.out.println(number);

        // ---------O(n^2)---------------
        // runtime complexity O(n*n) or O(n^2)
        for (int first : numbers) // O(n)
            for (int second : numbers) // O(n)
                System.out.println(first + ", " + second);

        // runtime complexity O(n+n^2) // simplified O(n^2)
        for (int number : numbers) // O(n)
            System.out.println(number);
        for (int first : numbers) // O(n)
            for (int second : numbers) // O(n)
                System.out.println(first + ", " + second);

        // runtime complexity O(n*n*n) or O(n^3)
        for (int first : numbers) // O(n)
            for (int second : numbers) // O(n)
                for (int third : numbers) // O(n)
                    System.out.println(first + ", " + second + ", " + third);
    }

    // ---------O(n)---------------
    public static void log(int[] numbers, String[] names) {
        // runtime complexity O(n+m) // simplified O(n)
        for (int number : numbers) // O(n)
            System.out.println(number);
        for (String name : names) // O(m)
            System.out.println(name);
    }

    // ---------Space Complexity---------------
    public void greet(String[] names) {
        // O(n) space
        String[] copy = new String[names.length];

        // O(1) space
        for (int i = 0; i < names.length; i++)
            System.out.println("Hi" + names[i]);
    }

    // -----------Working with Arrays--------------
    public static void array() {
        int[] numbers = new int[3];
        System.out.println(numbers); // [I@60addb54

        System.out.println(Arrays.toString(numbers)); // [0, 0, 0]

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(Arrays.toString(numbers)); // [10, 20, 30]

        // or
        int[] nums = { 10, 20, 30 };
        System.out.println(Arrays.toString(nums)); // [10, 20, 30]

        System.out.println(nums.length); // 3
    }

    // -------------Working with Linked Lists-----------------
    // public static void linkedList() {
    // LinkedList list = new LinkedList();
    // list.add(10);
    // list.add(20);
    // list.add(30);
    // System.out.println(list);
    // list.addFirst(5);
    // System.out.println(list); // [5, 10, 20, 30]
    // System.out.println(list.contains(10)); // true
    // System.out.println(list.indexOf(10)); // 1
    // System.out.println(list.size()); // 4
    // var array = list.toArray();
    // System.out.println(Arrays.toString(array)); // [5, 10, 20, 30]
    // list.removeLast();
    // list.remove(1);
    // list.removeFirst();
    // }
}