package Crypto;

public class Play {

    public static void main(String [] args) {

        System.out.println(3 / 2);                // prints 1
        System.out.println(-3 / 2);               // prints -1
        System.out.println(Math.floor(-1.25));    // prints -2.0
        System.out.println(Math.floor(-33.1));    // prints -34.0
        System.out.println(Math.floor(33.1));     // prints 33.0
        System.out.println(-5 / 2);               // prints -2
        System.out.println(Math.floor(-5 / 2.0)); // prints -3.0
        System.out.println(Math.floorDiv(-3, 2)); // prints -2
        System.out.println("");

        // remainder play using integer division
        System.out.println(-15 % 12);             // prints -3
        System.out.println(-93 % 13);             // prints -2
        System.out.println("");

        // remainder play using floor division
        System.out.println(Math.floorMod(-15, 12)); // prints 9
        System.out.println(Math.floorMod(-93, 13)); // prints 11

    }

}
