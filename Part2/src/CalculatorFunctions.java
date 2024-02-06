import java.util.Scanner;

class CalculatorFunctions {
    private Scanner sc = new Scanner(System.in);

    public double add(InputHandler inputHandler) {
        double num1 = inputHandler.getDoubleInput("Enter first number: ");
        double num2 = inputHandler.getDoubleInput("Enter second number: ");
        return num1 + num2;
    }

    public double subtract(InputHandler inputHandler) {
        double num1 = inputHandler.getDoubleInput("Enter first number: ");
        double num2 = inputHandler.getDoubleInput("Enter second number: ");
        return num1 - num2;
    }

    public double multiply(InputHandler inputHandler) {
        double num1 = inputHandler.getDoubleInput("Enter first number: ");
        double num2 = inputHandler.getDoubleInput("Enter second number: ");
        return num1 * num2;
    }

    public double divide(InputHandler inputHandler) {
        double numerator = inputHandler.getDoubleInput("Enter numerator: ");
        double denominator = inputHandler.getDoubleInput("Enter denominator: ");

        if (denominator == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }

        return numerator / denominator;
    }

    public double squareRoot(InputHandler inputHandler) {
        double num = inputHandler.getDoubleInput("Enter a number: ");
        return Math.sqrt(num);
    }

    public double power(InputHandler inputHandler) {
        double base = inputHandler.getDoubleInput("Enter base: ");
        double exponent = inputHandler.getDoubleInput("Enter exponent: ");
        return Math.pow(base, exponent);
    }

    public double mean(InputHandler inputHandler) {
        System.out.println("Enter numbers to calculate mean. Enter 'end' to stop.");
        double sum = 0;
        int count = 0;

        while (true) {
            String input = inputHandler.getStringInput();
            System.out.println("Enter a number: ");
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            try {
                double num = Double.parseDouble(input);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'end' to stop.");
            }
        }

        if (count == 0) {
            System.out.println("No valid numbers entered.");
            return Double.NaN;
        }

        return sum / count;
    }

    public double variance(InputHandler inputHandler) {
        System.out.println("Enter numbers to calculate variance. Enter 'end' to stop.");
        double sum = 0;
        double sumOfSquares = 0;
        int count = 0;

        while (true) {
            String input = inputHandler.getStringInput();
	        System.out.println("Enter a number: ");
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            try {
                double num = Double.parseDouble(input);
                sum += num;
                sumOfSquares += num * num;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'end' to stop.");
            }
        }

        if (count == 0) {
            System.out.println("No valid numbers entered.");
            return Double.NaN;
        }

        double mean = sum / count;
        return sumOfSquares / count - mean * mean;
    }
}
