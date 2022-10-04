package Crypto;

import java.util.Random;

public class Stream {

    public static String E(String clear, int key) {
        String cipher = "";
        final int alpha_length = 26;  // this should not change

        // add a random number generator
        Random rng = new Random();
        rng.setSeed(key);  // seeding the random number generator

        for (int i = 0; i < clear.length(); i++) {
            // define the character at this index
            char clear_char = clear.charAt(i);
            // get the position of the character in the alphabet
            int clear_char_pos = clear_char - 'a';

            int shift = rng.nextInt(100 );
            System.out.println(shift);

            // get the position of the cipher character in the alphabet
            int cipher_char_pos = Math.floorMod(clear_char_pos + shift, alpha_length);

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

        Random rng = new Random();
        rng.setSeed(key);

        for (int i = 0; i < cipher.length(); i++) {
            // define the character at this index
            char cipher_char = cipher.charAt(i);
            // get the position of the character in the alphabet
            int cipher_char_pos = cipher_char - 'a';

            int shift = rng.nextInt(100);
            System.out.println(shift);

            // get the position of the decrypt character in the alphabet
            int clear_char_pos = Math.floorMod(cipher_char_pos - shift, alpha_length);

            // get the decrypt character out of unicode
            char clear_char = (char) (clear_char_pos + 'a');
            // add it to decrypt
            clear += clear_char;
        }
        return clear;
    }

    public static void main(String [] args) {

        System.out.println(E("java", 10));
        System.out.println(D("wckm", 10));

    }

}
