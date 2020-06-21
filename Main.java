package encryptdecrypt;
/**
 * @version 1.0
 * @author github.com/jan00sh
 * @since 21-06-2020
 */
public class Main {
    public static void main(String[] args) {
        String algorithm = "shift";
        boolean mode = true;
        String data = "";
        String source = null;
        String output = null;
        int key = 0;

        for (int i = 0; i < args.length - 1; i++) {
            switch(args[i]) {
                case "-mode":
                    if (args[i+1].toLowerCase().equals("dec")) {
                        mode = false;
                    }
                    break;
                case "-alg":
                    if (args[i+1].toLowerCase().equals("unicode")) {
                        algorithm = "unicode";
                    }
                    break;
                case "-key":
                    try {
                        key = Integer.parseInt(args[i+1]);
                    } catch (NumberFormatException e) {
                        key = 0;
                    }
                    break;
                case "-data":
                    data = args[i+1];
                    break;
                case "-in":
                    source = args[i+1];
                    break;
                case "-out":
                    output = args[i+1];
                    break;
            }
            if (source != null) {
                data = InputFromFile.inputFromFile(source);
            }
            System.out.println(Display.displayResult(Processor.getResult(mode, algorithm, data, key), output));
            System.out.println(data);
        }
    }
}
