import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

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
        linkedList();
    }

    public static void log(int[] numbers) {
        //---------O(1)---------------
        // 0(2) // simplified O(1)
        System.out.println(numbers[0]); // O(1)
        System.out.println(numbers[0]); // O(1)

        //---------O(n)---------------
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


        //---------O(n^2)---------------
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

    //---------O(n)---------------
    public static void log(int[] numbers, String[] names) {
        // runtime complexity O(n+m) // simplified O(n)
        for (int number : numbers) // O(n)
            System.out.println(number);
        for (String name : names) // O(m)
            System.out.println(name);
    }


    //---------Space Complexity---------------
    public void greet(String[] names) {
        // O(n) space
        String[] copy = new String[names.length];

        // O(1) space
        for (int i=0; i<names.length; i++)
            System.out.println("Hi" + names[i]);
    }

    //-----------Working with Arrays--------------
    public static void array() {
        int[] numbers = new int[3];
        System.out.println(numbers); // [I@60addb54

        System.out.println(Arrays.toString(numbers)); // [0, 0, 0]

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(Arrays.toString(numbers)); // [10, 20, 30]

        // or
        int[] nums = {10, 20, 30};
        System.out.println(Arrays.toString(nums)); // [10, 20, 30]

        System.out.println(nums.length); // 3
    }

    //-------------Working with Linked Lists-----------------
    public static void linkedList() {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.addFirst(5);
        System.out.println(list); // [5, 10, 20, 30]
        System.out.println(list.contains(10)); // true
        System.out.println(list.indexOf(10)); // 1
        System.out.println(list.size()); // 4
        var array = list.toArray();
        System.out.println(Arrays.toString(array)); // [5, 10, 20, 30]
        list.removeLast();
        list.remove(1);
        list.removeFirst();
    }
}