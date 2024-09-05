import java.util.HashMap;

public class Trie {
    public static int ALPHABET_SIZE = 26;

    private class Node {
        private char value;
        // private Node[] children = new Node[ALPHABET_SIZE];
        private HashMap<Character, Node> children = new HashMap<>();
        private boolean isEndOfWord;

        public Node(char value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }

        public boolean hasChild(char ch) {
            return children.containsKey(ch);
        }

        public void addChild(char ch) {
            children.put(ch, new Node(ch));
        }

        public Node getChild(char ch) {
            return children.get(ch);
        }
    }

    private Node root = new Node(' ');

    // // Using an array
    // public void insert(String word) {
    // var current = root;
    // for (var ch : word.toCharArray()) {
    // var index = ch - 'a';
    // if (current.children[index] == null)
    // current.children[index] = new Node(ch);
    // current = current.children[index];
    // }
    // current.isEndOfWord = true;
    // }

    // // Using a HashTable
    // public void insert(String word) {
    // var current = root;
    // for (var ch : word.toCharArray()) {
    // if (current.children.get(ch) == null)
    // current.children.put(ch, new Node(ch));
    // current = current.children.get(ch);
    // }
    // current.isEndOfWord = true;
    // }

    // Using an Abstraction
    public void insert(String word) {
        var current = root;
        for (var ch : word.toCharArray()) {
            if (!current.hasChild(ch))
                current.addChild(ch);
            current = current.getChild(ch);
        }
        current.isEndOfWord = true;
    }
}
