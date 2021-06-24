import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager()
        String input = scanner.nextLine();
        while (!input.equals(Commands.EXIT)) {
            System.out.println("Привет!");
            input = scanner.nextLine();
        }
    }
}
