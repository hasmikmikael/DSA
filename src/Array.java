import java.util.ArrayList;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public void insert(int item) {
        // If the array is full, resize it
        if (items.length == count) {
            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            // Set "items" to this new array
            items = newItems;
        }

        // Add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // Shift the items to the left to fill the hole
        // [10, 20, 30, 40]
        // index: 1
        // 1 <- 2
        // 2 <- 3
        for (int i = index; i < count; i++)
            items[i] = items[i+1];

        count--;
    }

    public int indexOf(int item) {
        // If we find it, return index
        // Otherwise, return -1
        // Best Case scenario when the item is the first member of the array O(1)
        // Worst Case scenario when the item is at the end of the array O(n)
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public int max() {
        // O(n)
        int max = items[0];
        for (int i = 1; i < count; i++) {
            if (items[i] > max)
                max = items[i];
        }

        return max;
    }

    public Array intersect(Array another) {
        // O(n*m)
        ArrayList<Integer> commonItems = new ArrayList<Integer>();

        for (int i = 0; i < count; i++) {
            if (another.indexOf(items[i]) >= 0)
                commonItems.add(items[i]);
        }

        Array result = new Array(commonItems.size());
        for (int item : commonItems)
            result.insert(item);

        return result;
    }
}
