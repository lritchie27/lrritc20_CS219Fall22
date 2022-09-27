package Exam1Study;

public class Exam1Prep {

    public static void main(String [] args) {

        String s = "hippopotomonstrosesquippedaliophobia";
        System.out.println(s.charAt(0)); // returns "h"
        System.out.println(s.indexOf('q')); // returns 19
        System.out.println(s.indexOf('o')); // returns 4
        System.out.println(s.substring(s.indexOf('m'),16)); // returns "monstro"
        System.out.println(s.charAt(s.length() - 1)); // if it was like original, returns indexOutOfBounds error


        System.out.println(Math.round(6.02235e4)); // 6.02e4
        System.out.printf("%1.3f\n", 3.14159); // 3.142
        System.out.println('d' - 'a'); // 100 - 97 = 3
        System.out.println(2 + "bc"); // 2bc
        System.out.println(2 + 3 + "bc"); // 5bc
        System.out.println((2 + 3) + "bc"); // 5bc
        System.out.println("bc" + 2 + 3); // bc23
        System.out.println("bc" + (2 + 3)); // bc5

    }

}
