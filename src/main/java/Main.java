import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager("C:/Users/Professional/IdeaProjects/fileManager/root");
        String input = scanner.nextLine();
        while (!input.equals(Commands.EXIT)) {
            String tokens[] = input.split(" ");
            String command = tokens[0];
            if (command.equals(Commands.LIST_OF_FILES)) {
                fileManager.listOfFiles(false);
            } else if (command.equals(Commands.LIST_OF_FILES_WITH_SIZE)) {
                fileManager.listOfFiles(true);
            } else if (command.equals(Commands.COPY_FILE)) {
                String sourceFileName = tokens[1];
                String destFileName = tokens[2];
                fileManager.copyFile(sourceFileName, destFileName);
            }
            input = scanner.nextLine();
        }
    }
}
