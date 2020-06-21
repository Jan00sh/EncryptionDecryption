package encryptdecrypt;

abstract class Cipher implements EncryptionDecryption {
    protected String data;
    protected final int key;
    Cipher() {
        this.data = "";
        this.key = 0;
    }
    Cipher(String data, int key) {
        this.data = data;
        this.key = key;
    }
}
