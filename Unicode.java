package encryptdecrypt;

public class Unicode extends Cipher {
    Unicode(String data, int key) {
        super(data, key);
    }

    @Override
    public String enc() {
        String result = "";
        for (char character : data.toCharArray()) {
            result += (char) ((int) character + key);
        }
        return result;
    }

    @Override
    public String dec() {
        String result = "";
        for (char character : data.toCharArray()) {
            result += (char) ((int)character - key);
        }
        return result;
    }
}
