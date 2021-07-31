import java.util.Scanner;

class Calculator implements CalculatorInterface {
    Scanner num = new Scanner(System.in);
    double firstNum;
    double secondNum;

    public void main() {
        Scanner num = new Scanner(System.in);
        while (true) {
            menu();
            String choice = num.nextLine();
            computation(choice);
        }
    }

    @Override
    public void menu() {
        System.out.println(" ");
        System.out.println("Hello human, let's start!");
        System.out.println("MAIN MENU");
        System.out.println("-----------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. SquareRoot");
        System.out.println("6. Exponentiation");
        System.out.println("7. Program exit");
        System.out.print("Please choose: ");
    }


    @Override
    public void hello() {
        System.out.print("Enter the first number: ");
        String fNum = num.nextLine();
        System.out.print("Enter the second number: ");
        String sNum = num.nextLine();
        setNumbers(fNum, sNum);
    }

    @Override
    public void setNumbers(String number1, String number2) {
        String x = number1;
        String y = number2;
        firstNum = Double.parseDouble(x);
        secondNum = Double.parseDouble(y);
    }

    @Override
    public void setNumbers(String number1) {
        String x = number1;
        firstNum = Double.parseDouble(x);
    }

    @Override
    public void addition() {
        hello();
        String result = String.format("%.3f", firstNum + secondNum);
        System.out.println("Addition result: " + result);

    }

    @Override
    public void substraction() {
        hello();
        String result = String.format("%.3f", firstNum - secondNum);
        System.out.println("Subtraction result: " + result);
    }

    @Override
    public void multiplication() {
        hello();
        String result = String.format("%.3f", firstNum * secondNum);
        System.out.println("Multiplication result: " + result);
    }

    @Override
    public void division() {
        hello();
        if (secondNum != 0) {
            String result = String.format("%.3f", firstNum / secondNum);
            System.out.println("Division result: " + result);
        } else {
            System.out.println("You cannot divide by Zero!");
        }
    }

    @Override
    public void squareRoot() {
        System.out.print("Enter the number: ");
        String fNum = num.nextLine();
        setNumbers(fNum);
        String result = String.format("%.3f", Math.sqrt(firstNum));
        System.out.printf("The square root of " + firstNum + " equals " + result);
    }

    @Override
    public void exponentiation() {
        hello();
        String result = String.format("%.3f", Math.pow(firstNum, secondNum));
        System.out.printf("The number " + secondNum + " raised to the power of " + secondNum + "equals" + result);
    }

    @Override
    public void computation(String choice) {
        int choiceNum = Integer.parseInt(choice);
        switch (choiceNum) {
            case 1:
                addition();
                break;
            case 2:
                substraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                squareRoot();
                break;
            case 6:
                exponentiation();
                break;
            default:
                System.exit(0);
        }
    }
}




