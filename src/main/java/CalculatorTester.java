import java.util.Scanner;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner num = new Scanner(System.in);
        while (true) {
            System.out.println("-----------");
            System.out.println("Hello human, let's start!");
            calculator.menu();
            String choice = num.nextLine();
            calculator.computation(choice);
        }
    }
}
