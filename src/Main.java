//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //-------------Big O Notation---------------
        int[] numbers = { 10, 20, 30, 40 };
        log(numbers);
    }

    // O(1)
    public static void log(int[] numbers) {
        // 0(2) // simplified O(1)
        System.out.println(numbers[0]); // O(1)
        System.out.println(numbers[0]); // O(1)
    }
}