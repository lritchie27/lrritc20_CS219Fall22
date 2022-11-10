package Chap9ImmutableObjects;

import java.math.BigInteger;
import java.util.Random;

public class DiffieHellman {

    public static void main(String[] args) {

        // Get a big prime number.
        BigInteger p = new BigInteger("7919");
        BigInteger Apriv = new BigInteger("123456789");

        // Alice computes her public key
        BigInteger Apub = BigInteger.TWO.modPow(Apriv, p);

        // Send Bob the public key

        // Bob picks a private key
        BigInteger Bpriv = new BigInteger("497");

        // Bob computes his public key
        BigInteger Bpub = BigInteger.TWO.modPow(Bpriv, p);

        // Alice can now compute the shared key
        BigInteger Ashared = Bpub.modPow(Apriv, p);

        // Bob can compute the shared key
        BigInteger Bshared = Apub.modPow(Bpriv, p);

        // print out the shared keys

        System.out.println("Alice Key  :  Bob Key");
        System.out.printf("     %,d : %,d\n", Ashared, Bshared);

        System.out.println(Ashared.compareTo(Bshared) == 0);

    }

}
