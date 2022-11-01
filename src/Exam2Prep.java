import HW7.HW7;
import java.util.Random;
import java.util.Scanner;

public class Exam2Prep {

    public static char[] jumble(String s) {
        char [] aoc = HW7.make_array(s);
        Random rng = new Random();
        rng.nextInt(0, aoc.length);
        for (int i = 0; i < aoc.length; i++) {
            int change = i + rng.nextInt(aoc.length - i);
            char temp = aoc[i];
            aoc[i] = aoc[change];
            aoc[change] = temp;
        }
        return aoc;
    }

    public static void main(String[] args) {
        System.out.println(-93 % 13);

        String [] words = Wordle.Game.load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309);

        Random rng = new Random();
        String answer = words[rng.nextInt(0, words.length)];
        System.out.println(jumble(answer));

        // Get input from keyboard
        Scanner kbd = new Scanner(System.in);

        boolean valid = false;
        String word = "";

        while (!valid) {
            System.out.print("Guess the word: ");

            // check to see if user entered a number
            if (kbd.hasNext()) {
                word = kbd.next();
            }
            if (word.equals(answer)) {
                System.out.println();
                System.out.println("You guessed the word correctly!");
                valid = true;
            }
            else {
                System.out.println("You didn't guess the word. Try again.");
            }
        }

    }

}
