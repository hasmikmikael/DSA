import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    // O(n)
    public int countPairsWithDiff(int[] numbers, int k) {
        // Input: [1, 7, 5, 9, 2, 12, 3] K=2
        // Output: 4
        // We have four pairs with difference 2: (1, 3), (3, 5), (5, 7), (7, 9).
        //
        // For a given number (a) and difference (diff), number (b) can be:
        //
        // b = a + diff
        // b = a - diff
        //
        // We can iterate over our array of numbers, and for each number,
        // check to see if we have (current + diff) or (current - diff).
        // But looking up items in an array is an O(n) operation. With this
        // algorithm, we need two nested loops (one to pick a,
        // and the other to find b). This will be an O(n^2) operation.
        //
        // int count = 0;
        // for (int i = 0; i < numbers.length; i++) {
        // for (int j = i + 1; j < numbers.length; j++) {
        // if (Math.abs(numbers[i] - numbers[j]) == k)
        // count++;
        // }
        // }
        // return count;
        //
        // We can optimize this by using a set. Sets are like hash tables
        // but they only store keys. We can look up a number in constant time.
        // No need to iterate the array to find it.

        // So, we start by adding all the numbers to a set for quick look up.

        Set<Integer> set = new HashSet<>();
        for (var number : numbers)
            set.add(number);

        // Now, we iterate over the array of numbers one more time,
        // and for each number check to see if we have (a + diff) or
        // (a - diff) in our set.
        //
        // Once we're done, we should remove this number from our set
        // so we don't double count it.
        var count = 0;
        for (var number : numbers) {
            if (set.contains(number + k))
                count++;
            if (set.contains(number - k))
                count++;
            set.remove(number);
        }

        // Time complexity of this method is O(n).

        return count;
    }
}
