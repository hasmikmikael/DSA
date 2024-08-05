import java.util.HashMap;
import java.util.Map;

public class HashTableExercises {
    // O(n)
    public int mostFrequent(int[] numbers) {
        // [1, 2, 2, 3, 4, 4, 4]
        // 1 = 1
        // 2 = 2
        // 3 = 1
        // 4 = 3
        // To find the most frequent item in an array, we have to count the
        // number of times each item has been repeated. We can use a hash
        // table to store the items and their frequencies.
        Map<Integer, Integer> map = new HashMap<>();
        for (var number : numbers) {
            var count = map.containsKey(number) ? map.get(number) : 0;
            map.put(number, count + 1);
        }

        // Once we've populated our hash table, we need to iterate over all
        // key/value pairs and find the one with the highest frequency.
        int max = -1;
        int result = numbers[0];
        for (var item : map.entrySet()) {
            if (item.getValue() > max) {
                max = item.getValue();
                result = item.getKey();
            }
        }

        // Runtime complexity of this method is O(n) because we have to
        // iterate the entire array to populate our hash table.

        return result;
    }
}
