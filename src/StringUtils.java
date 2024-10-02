import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class StringUtils {
    public static int countVowels(String str) {
        if (str == null)
            return 0;

        int count = 0;
        String vowels = "aeiou";
        for (var ch : str.toLowerCase().toCharArray())
            // if (vowels.contains(Character.toString(ch)))
            if (vowels.indexOf(ch) != -1)
                count++;

        return count;
    }

    // O(n)
    public static String reverse(String str) {
        if (str == null)
            return "";

        StringBuilder reversed = new StringBuilder();
        for (var i = str.length() - 1; i >= 0; i--) // O(n)
            reversed.append(str.charAt(i)); // O(1)

        return reversed.toString();
    }

    public static String reverseWords(String sentence) {
        if (sentence == null)
            return "";

        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);

        // String[] words = sentence.split(" ");
        // StringBuilder reversed = new StringBuilder();
        // for (int i = words.length - 1; i >= 0; i--)
        // reversed.append(words[i] + " ");

        // return reversed.toString().trim();
    }
}
