package Crypto;

public class Caesar {

    public static String E(String clear, int key) {
        String cipher = "";
        final int alpha_length = 26;  // this should not change

        for (int i = 0; i < clear.length(); i++) {
            // define the character at this index
            char clear_char = clear.charAt(i);
            // get the position of the character in the alphabet
            int clear_char_pos = clear_char - 'a';
            // get the position of the cipher character in the alphabet
            int cipher_char_pos = Math.floorMod(clear_char_pos + key, alpha_length);

            // get the cipher character out of unicode
            char cipher_char = (char) (cipher_char_pos + 'a');
            // add it to cipher
            cipher += cipher_char;

        }

        return cipher;
    }

    public static String D(String cipher, int key) {
        String clear = "";
        final int alpha_length = 26;

        for (int i = 0; i < cipher.length(); i++) {
            // define the character at this index
            char cipher_char = cipher.charAt(i);
            // get the position of the character in the alphabet
            int cipher_char_pos = cipher_char - 'a';
            // get the position of the decrypt character in the alphabet
            int clear_char_pos = Math.floorMod(cipher_char_pos - key, alpha_length);

            // get the decrypt character out of unicode
            char clear_char = (char) (clear_char_pos + 'a');
            // add it to decrypt
            clear += clear_char;
        }
        return clear;
    }

    public static String d(String cipher, int key) {
        return E(cipher, -key);
    }

    public static void main(String [] args) {

        // This NOT!!!! how you compare strings
        System.out.println(E("cold", 20) == "wifx");

        // use .equals() to compare two strings
        System.out.println(E("cold", 20).equals("wifx"));

        // test decrypt method
        System.out.println(D(E("cold", 20), 20).equals("cold"));

        // test d method
        System.out.println(d(E("cold", 20), 20).equals("cold"));

    }

}
