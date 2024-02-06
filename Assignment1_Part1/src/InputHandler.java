import java.util.Scanner;
import java.io.*;

public class InputHandler {

    private Scanner sc = new Scanner(System.in);
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private DataInputStream dis = new DataInputStream(System.in);
    private Console cn = System.console();

    public int getInput() throws IOException {
        System.out.println("Choose an input method:");
        System.out.println("1. Scanner");
        System.out.println("2. BufferedReader");
        System.out.println("3. DataInputStream");
        System.out.println("4. Console");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                return inputScanner();
            case 2:
                return inputBuffered();
            case 3:
                return inputDataInputStream();
            case 4:
                return inputConsole();
            default:
                System.out.println("Invalid choice. Defaulting to Scanner.");
                return inputScanner();
        }
    }

    public int inputScanner() {
        System.out.print("Enter input using Scanner: ");
        return sc.nextInt();
    }

    public int inputBuffered() throws IOException {
        System.out.print("Enter input using BufferedReader: ");
        return Integer.parseInt(bf.readLine());
    }

    public int inputDataInputStream() throws IOException {
        System.out.print("Enter input using DataInputStream: ");
        try {
            return dis.readInt();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid input. Defaulting to Scanner.");
            return inputScanner();
            
        }
    }

    public int inputConsole() {
        if (cn == null) {
            System.out.println("Console is not available. Defaulting to Scanner.");
            return inputScanner();
        }

        System.out.print("Enter input using Console: ");
        String inputString = cn.readLine();

        try {
            return Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Defaulting to Scanner.");
            return inputScanner();
        }
    }

    public static void main(String[] args) throws IOException {
        InputHandler inputHandler = new InputHandler();
        int userInput = inputHandler.getInput();
        System.out.println("User input: " + userInput);
    }
}
