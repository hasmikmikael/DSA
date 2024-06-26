import java.util.Arrays;

public class PriorityQueue {
    // insert(2)
    //  0  1  2  3
    // [1, 3, 5, 7]
    //  0  1  2  3  4
    // [1  2  3  5  7]
    // items[i+1] = items[i]
    private int[] items = new int[5];
    private int count;

    public void add(int item) {
        if (count == items.length)
            //items = Arrays.copyOf(items, items.length * 2);
            throw new IllegalStateException();

        // Shifting items
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        items[i + 1] = item;
        count++;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
