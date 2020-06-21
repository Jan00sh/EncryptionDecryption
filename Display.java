package encryptdecrypt;

class Display {
    protected static String displayResult(String data, String output) {
        if (output == null) {
            return data;
        } else {
            return OutputToFile.outputToFile(data, output);
        }
    }
}
