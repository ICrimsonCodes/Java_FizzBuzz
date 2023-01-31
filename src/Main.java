import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x = scanner.nextInt();
        for (int i = 0; i <= x; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}