import java.util.Scanner;

class InputHandler {
    private Scanner scanner = new Scanner(System.in);

    public int getIntInput() {
        return scanner.nextInt();
    }

    public double getDoubleInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public String getStringInput() {
        return scanner.next();
    }
}
