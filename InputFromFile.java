package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class InputFromFile {
    protected static String inputFromFile(String url) {
        String data = "";
        File file = new File(url);
        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()){
                data = data.concat(scanner.nextLine());
            }
            return data;
        } catch (FileNotFoundException e) {
            return "Error! File not found!";
        }
    }
}
