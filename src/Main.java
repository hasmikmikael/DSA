//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //-------------Big O Notation---------------
        int[] numbers = { 10, 20, 30, 40 };
        log(numbers);
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
}