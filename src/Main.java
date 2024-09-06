import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.Stack;
//import java.util.LinkedList;
import java.util.Set;

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

        CharFinder charFinder = new CharFinder();
        var ch = charFinder.findFirstNonRepeatingChar("a green apple");
        System.out.println(ch); // g

        // ************ Sets *******************
        Set<Integer> set = new HashSet<>();
        int[] nmbrs = { 1, 3, 3, 2, 4, 2 };
        for (var nmbr : nmbrs)
            set.add(nmbr);

        System.out.println(set); // [1, 2, 3, 4]

        var chr = charFinder.findFirstRepeatedChar("green apple");
        System.out.println(chr); // e

        // ********** Building a Hash Table using Chaining strategy ***************
        HashTable hashTable = new HashTable();
        hashTable.put(6, "A");
        hashTable.put(8, "B");
        hashTable.put(11, "C");
        System.out.println(hashTable.get(6)); // A
        hashTable.put(6, "A+");
        System.out.println(hashTable.get(6)); // A+
        hashTable.remove(6);
        System.out.println(hashTable.get(10)); // null

        // ******** Exercises Hash Table ************
        int[] arr = { 1, 2, 2, 3, 4, 4, 4 };
        HashTableExercises table = new HashTableExercises();
        System.out.println(table.mostFrequent(arr)); // 4

        int[] arry = { 1, 7, 5, 9, 2, 12, 3 };
        System.out.println(table.countPairsWithDiff(arry, 2)); // 4

        int[] aray = { 2, 7, 11, 15 };
        var twoSum = table.twoSum(aray, 9);
        for (var element : twoSum)
            System.out.println(element); // 0 1

        // *** Building a Hash Table using Linear Probing strategy ***
        HashMap hashMap = new HashMap();
        hashMap.put(6, "A");
        hashMap.put(8, "B");
        hashMap.put(11, "C");
        System.out.println(hashMap.get(6)); // A
        hashMap.put(6, "A+");
        System.out.println(hashMap.get(6)); // A+
        hashMap.remove(6);
        System.out.println(hashMap.get(10)); // null

        // *********** Trees ************
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println(tree.find(10)); // true
        tree.traversePreOrder(); // 7 4 1 6 9 8 10
        tree.traverseInOrder(); // 1 4 6 7 8 9 10
        tree.traversePostOrder(); // 1 6 4 8 10 9 7
        System.out.println(tree.height()); // 2
        System.out.println(tree.min()); // 1

        // ******* Recursion ***************
        System.out.println(factorial(4)); // 24

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);
        System.out.println(tree.equals(tree2)); // true
        System.out.println(tree.equals(null)); // false

        System.out.println(tree2.isBinarySearchTree()); // true
        tree2.swapRoot();
        System.out.println(tree2.isBinarySearchTree()); // false

        tree.printNodesAtDistance(0); // 7
        tree.printNodesAtDistance(1); // 4 9
        tree.printNodesAtDistance(2); // 1 6 8 10

        // var lst = tree.getNodesAtDistance(1);
        // for (var item : lst)
        // System.out.println(item); // 4 9

        tree.traverseLevelOrder(); // 7 4 9 1 6 8 10
        System.out.println(tree.size()); // 7
        System.out.println(tree.countLeaves()); // 4
        System.out.println(tree.max()); // 10
        System.out.println(tree.contains(8)); // true
        System.out.println(tree.areSibling(1, 6)); // true

        var ancestors = tree.getAncestors(8);
        for (var ancestor : ancestors)
            System.out.println(ancestor); // 9 7

        System.out.println(tree.isBalanced()); // true
        System.out.println(tree.isPerfect()); // true

        var tr = new Tree();
        tr.insert(12);
        tr.insert(3);
        tr.insert(9);
        System.out.println(tr.isBalanced()); // false
        System.out.println(tr.isPerfect()); // false

        // ********* AVL Trees **************
        var avlTree = new AVLTree();
        avlTree.insert(10);
        avlTree.insert(20);
        avlTree.insert(30);
        // 10
        // //20
        // ////30
        // 10 is right heavy
        // Left Rotate 10
        //
        // avlTree.insert(10);
        // avlTree.insert(30);
        // avlTree.insert(20);
        // 10
        // //30
        // 20
        // 10 is right heavy
        // Right Rotate 30
        // Left Rotate 10

        // ********* Heaps *********
        var heap = new Heap(10);
        heap.insert(10);
        heap.insert(5);
        heap.insert(17);
        heap.insert(4);
        heap.insert(22);
        // [22, 17, 10, 4, 5]

        heap.remove();
        // [17, 5, 10, 4, 5]

        // ****** Heap Sort *******
        int[] numrs = { 5, 3, 10, 1, 4, 2 };
        var heapSort = new Heap(6);
        for (var numr : numrs)
            heapSort.insert(numr);
        // while (!heapSort.isEmpty())
        // System.out.println(heapSort.remove()); // 10 5 4 3 2 1

        // for (var i = 0; i < numrs.length; i++)
        // numrs[i] = heapSort.remove();
        // System.out.println(Arrays.toString(numrs)); // [10, 5, 4, 3, 2, 1]

        for (var i = numrs.length - 1; i >= 0; i--)
            numrs[i] = heapSort.remove();
        System.out.println(Arrays.toString(numrs)); // [1, 2, 3, 4, 5, 10]

        // ******** Exercise - Heapify *********
        int[] nms = { 5, 3, 8, 4, 1, 2 };
        MaxHeap.heapify(nms);
        System.out.println(Arrays.toString(nms)); // [8, 4, 5, 3, 1, 2]

        System.out.println(MaxHeap.getKthLargest(nms, 1)); // 8
        System.out.println(MaxHeap.getKthLargest(nms, 2)); // 5
        System.out.println(MaxHeap.getKthLargest(nms, 6)); // 1

        // int[] nums = { 8, 4, 5, 3, 1, 2, 7 }; // false
        int[] nums = { 8, 7, 5, 4, 3, 2, 1 }; // true
        System.out.println(Heap.isMaxHeap(nums));

        var minHeap = new MinHeap();
        minHeap.insert(20, "dog");
        minHeap.insert(4, "cat");
        minHeap.insert(5, "mouse");
        minHeap.insert(10, "turtle");
        minHeap.insert(15, "lizard");
        // [(4, "cat"), (10, "turtle"), (5, "mouse"), (20, "dog"), (15, "lizard")]
        minHeap.remove();
        // [(5, "mouse"), (10, "turtle"), (15, "lizard"), (20, "dog"), (15, "lizard")]

        var minPriorityQueue = new MinPriorityQueue();
        minPriorityQueue.add("dog", 20);
        minPriorityQueue.add("cat", 4);
        minPriorityQueue.add("mouse", 5);
        minPriorityQueue.add("turtle", 10);
        minPriorityQueue.add("lizard", 15);
        // [(4, "cat"), (10, "turtle"), (5, "mouse"), (20, "dog"), (15, "lizard")]
        minPriorityQueue.remove();
        // [(5, "mouse"), (10, "turtle"), (15, "lizard"), (20, "dog"), (15, "lizard")]

        // ************ Tries ********************
        var trie = new Trie();
        trie.insert("cat");
        trie.insert("canada");
        System.out.println(trie.contains("canada")); // true
        System.out.println(trie.contains("can")); // false
        System.out.println(trie.contains("")); // false
        System.out.println(trie.contains(null)); // false
    }

    // ********* Recursion ******************
    public static int factorial(int n) {
        // // Iteration approach using a loop
        // var factorial = 1;
        // for (var i = n; i > 1; i--)
        // factorial *= i;
        // return factorial;

        // Recursion

        // Base condition
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
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