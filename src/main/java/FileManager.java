import java.io.File;

public class FileManager {

    private String currentFolder;
    private String root;

    public FileManager(String currentFolder) {
        this.currentFolder = currentFolder;
        this.root = currentFolder;
    }


    public void listOfFiles(boolean withSize) {
        File currentFolderAsFile = new File(currentFolder);

        File files[] = currentFolderAsFile.listFiles();
        for (File file : files) {
            if (withSize) {
                System.out.print(file.getName() + " " + file.length());
            } else {
            System.out.print(file.getName());}
            }
        }
    }
}
