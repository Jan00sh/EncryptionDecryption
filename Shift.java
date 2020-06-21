package encryptdecrypt;

public class Shift extends Cipher {
    Shift(String data, int key) {
        super(data, key);
    }

    @Override
    public String enc() {
        String result = "";
        for (char character : data.toCharArray()) {
             if (character >= 65 && character <= 90) {
                 if (character + key > 90) {
                     result += (Math.abs(character + key - 90) + 65);
                 } else {
                     result += character + key;
                 }
             } else if (character >= 97 && character <= 122) {
                 if (character + key >= 122) {
                     result += (Math.abs(character + key - 122) + 97);
                 } else {
                     result += character + key;
                 }
             }
        }
        return result;
    }

    @Override
    public String dec() {
        String result = "";
        for (char character : data.toCharArray()) {
            if (character >= 65 && character <= 90) {
                if (character - key <= 65) {
                    result += (Math.abs(character + key - 65) - 90);
                } else {
                    result += character - key;
                }
            } else if (character >= 97 && character <= 122) {
                if (character - key <= 97) {
                    result += (Math.abs(character + key - 97) - 122);
                } else {
                    result += character - key;
                }
            }
        }
        return result;
    }
}
