package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class InputFromFile {
    protected static String inputFromFile(String url) {
        File file = new File(url);
        try (Scanner scanner = new Scanner(file)) {
                return scanner.nextLine();
        } catch (FileNotFoundException e) {
            return "Error! File not found!";
        }
    }
}
