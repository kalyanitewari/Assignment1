import java.io.IOException;

public class MathCalculator {

    private InputHandler inputHandler;
    private MathOperations mathOperations;

    public MathCalculator(InputHandler inputHandler, MathOperations mathOperations) {
        this.inputHandler = inputHandler;
        this.mathOperations = mathOperations;
    }

    public void displayMenu() {
        System.out.println("Choose an operation:");
        System.out.println("1. Fibonacci");
        System.out.println("2. Factorial");
        System.out.println("3. Exit");
    }
    
    private void calculateFibonacci() throws IOException {
        int n = inputHandler.getInput();
        System.out.println("Fibonacci(" + n + ") = " + mathOperations.calculateFibonacci(n));
    }

    private void calculateFactorial() throws IOException {
        int n = inputHandler.getInput();
        System.out.println("Factorial(" + n + ") = " + mathOperations.calculateFactorial(n));
    }

    public void performOperation() throws IOException {
        final int EXIT_OPTION = 3;
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = inputHandler.inputScanner();

            switch (choice) {
                case 1:
                    calculateFibonacci();
                    break;
                case 2:
                    calculateFactorial();
                    break;
                case EXIT_OPTION:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != EXIT_OPTION);
    }

    public static void main(String[] args) throws IOException {
        InputHandler inputHandler = new InputHandler();
        MathOperations mathOperations = new MathOperations();
        MathCalculator mathCalculator = new MathCalculator(inputHandler, mathOperations);

        mathCalculator.performOperation();
    }
}
