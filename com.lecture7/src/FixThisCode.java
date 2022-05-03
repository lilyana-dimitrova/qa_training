import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.util.Scanner;

public class FixThisCode {

    public static void main(String[] args) throws IOException {

        int howManyTimesToPrintTheTextToFile;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the destination path to the text file: ");
        String filePath = scanner.nextLine();

        if(new File(filePath).exists())
        {
            System.out.println("How many times to print to file?");
            try {
                howManyTimesToPrintTheTextToFile = scanner.nextInt();
            } catch (Exception e) {
                throw new IllegalArgumentException("Input must be integer");
            }

        }else{
            throw new InvalidPathException(filePath, "Invalid directory");
        }

        System.out.println("Please enter the text: ");
        String textToAdd = scanner.next();

        printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);

    }

    public static FileWriter getFileWriter(String filePath) throws IOException {
        return new FileWriter(filePath, true);
    }

    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }

}

