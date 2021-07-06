import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

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
            if (file.isDirectory()) {
                if (withSize) {
                    System.out.print(file.getName() + "\\ " + FileUtils.sizeOfDirectory(file));
                } else {
                    System.out.print(file.getName()+ "\\ ");
                }
            } else {
                if (withSize) {
                    System.out.print(file.getName() + " " + file.length());
                } else {
                    System.out.print(file.getName()+ " ");
                }
            }

        System.out.println();
        }
    }

    public void copyFile(String sourceFileName, String destFileName) {
        File source = new File(currentFolder + "\\" + sourceFileName);
        File dest = new File(currentFolder + "\\" + destFileName);
        try {
            FileUtils.copyFile(source, dest);
        } catch (IOException e) {
            System.out.println("Произошла ошибка");
        }
    }
}
