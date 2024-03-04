public class CipherRunner {
    public static void main(String[] args) {
        VigenereCipher vigenereCipher = new VigenereCipher();

        System.out.println(vigenereCipher.encrypt("encrypt_check.txt", "key_check.txt"));

        System.out.println(vigenereCipher.decrypt("decrypt_check.txt", "key_check.txt"));

        System.out.println("attack on dawn");

    }
}
