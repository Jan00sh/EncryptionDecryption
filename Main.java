package encryptdecrypt;
/**
 * @version 0.1
 * @author github.com/jan00sh
 * @since 21-06-2020
 */
public class Main {
    public static void main(String[] args) {
        boolean shift = true;
        boolean mode = true;
        String data = "";
        String source = "";
        String input = "";
        int key = 0;

        for (int i = 0; i < args.length - 1; i++) {
            switch(args[i]) {
                case "-mode":
                    if (args[i+1].toLowerCase().equals("unicode")) {
                        shift = false;
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
                    input = args[i+1];
                    break;
            }
        }
    }
}
