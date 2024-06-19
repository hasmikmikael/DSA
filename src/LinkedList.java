import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;

        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        // [10 -> 20 -> 30]
        // first -> 10
        // [10 20 -> 30]
        // first -> 20
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {
        // [10 -> 20 -> 30]
        // last -> 30
        // [10 -> 20  30]
        // previous -> 20
        // last -> 20
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == last) return current;
            current = current.next;
        }
        return null;
    }

    // O(1)
    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    // Exercise - Reversing a Linked List.
    public void reverse() {
        // [10 -> 20 -> 30]
        // [10 <- 20 <- 30]
        // p      c     n
        // n = c.next;
        // c.next = p;
        // [10 <- 20   30]
        //         p    c    n       // second iteration
        // [10 <- 20 <- 30]
        //              p    c    n  // third iteration
        if (isEmpty()) return;

        var previous = first;
        var current = first.next;
        // changing the direction of the links
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    // Exercise - Kth Node from the End in Linked List.
    // Find the Kth node from the end
    // of a linked list in one pass.
    public int getKthFromTheEnd(int k) {
        // [10 -> 20 -> 30 -> 40 -> 50]
        //              *           *
        // K = 1 (50)
        // K = 2 (40)
        // K = 3 (30)  (distance = 2) // they are apart from 2 nodes
        // Kth node (distance = k - 1)

        if (isEmpty())
            throw new IllegalStateException();

        var a = first;
        var b = first;

        for (int i = 0; i < k-1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
}
