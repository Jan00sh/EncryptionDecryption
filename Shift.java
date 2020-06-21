package encryptdecrypt;

public class Shift extends Cipher {
    Shift(String data, int key) {
        super(data, key);
    }

    @Override
    public String enc() {
        String result = "";
        for (int character : data.toCharArray()) {
             if (character >= 65 && character <= 90) {
                 if (character + key > 90) {
                     result += (char) (Math.abs(character + key - 90) + 64);
                 } else {
                     result += (char) (character + key);
                 }
             } else if (character >= 97 && character <= 122) {
                 if (character + key >= 122) {
                     result += (char) (Math.abs(character + key - 122) + 96);
                 } else {
                     result += (char) (character + key);
                 }
             } else {
                 result += (char) character;
             }
        }
        return result;
    }

    @Override
    public String dec() {
        String result = "";
        for (int character : data.toCharArray()) {
            if (character >= 65 && character <= 90) {
                if (character - key < 65) {
                    result += (char) (90 + (character - 64 - key));
                } else {
                    result += (char) (character - key);
                }
            } else if (character >= 97 && character <= 122) {
                if (character - key < 97) {
                    result += (char) (122 + (character - 96 - key));
                } else {
                    result += (char) (character - key);
                }
            } else {
                result += (char) character;
            }
        }
        return result;
    }
}
