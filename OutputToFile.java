package encryptdecrypt;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

class OutputToFile {
    protected static String outputToFile(String data, String url) {
        File file = new File(url);
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(data);
            return file.getAbsolutePath();
        } catch (FileNotFoundException e) {
            return "Error! Cannot write to file! " + e.getMessage();
        }
    }
}
