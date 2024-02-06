import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorFunctions calculator = new CalculatorFunctions();
        InputHandler inputHandler = new InputHandler();

        int choice;

        do {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = inputHandler.getIntInput();

            switch (choice) {
                case 1:
                    double addResult = calculator.add(inputHandler);
                    System.out.println("Addition Result: " + addResult);
                    break;
                case 2:
                    double subResult = calculator.subtract(inputHandler);
                    System.out.println("Subtraction Result: " + subResult);
                    break;
                case 3:
                    double mulResult = calculator.multiply(inputHandler);
                    System.out.println("Multiplication Result: " + mulResult);
                    break;
                case 4:
                    double divResult = calculator.divide(inputHandler);
                    System.out.println("Division Result: " + divResult);
                    break;
                case 5:
                    double sqrtResult = calculator.squareRoot(inputHandler);
                    System.out.println("Square Root Result: " + sqrtResult);
                    break;
                case 6:
                    double powerResult = calculator.power(inputHandler);
                    System.out.println("Power Result: " + powerResult);
                    break;
                case 7:
                    double meanResult = calculator.mean(inputHandler);
                    System.out.println("Mean Result: " + meanResult);
                    break;
                case 8:
                    double varianceResult = calculator.variance(inputHandler);
                    System.out.println("Variance Result: " + varianceResult);
                    break;
                case 0:
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 0);
    }
}