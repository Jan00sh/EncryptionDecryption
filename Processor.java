package encryptdecrypt;

class Processor {
    protected static String getResult(boolean mode, String algorithm, String data, int key) {
        Cipher machine;
        switch (algorithm) {
            case "shift":
                machine = new Shift(data, key);
                if (mode) {
                    return machine.enc();
                } else {
                    return machine.dec();
                }
            case "unicode":
                machine = new Unicode(data, key);
                if (mode) {
                    return machine.enc();
                } else {
                    return machine.dec();
                }
            default:
                return "Error! Invalid method";
        }
    }
}
