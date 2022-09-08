import java.util.Random;

public class LogicalOperators {

    public static void main(String [] args) {

        Random r = new Random();

        int coin_flip = r.nextInt(2);

        if (coin_flip == 0) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }

        int die1 = r.nextInt(6) + 1;
        int die2 = r.nextInt(6) + 1;

        System.out.println("Die 1: " + die1 + " | Die 2: " + die2);

        if (die1 == 1 && die2 == 1) {
            System.out.println("Snake eyes");
        }

        // nested if statements
        if (die1 == 1) {
            if (die2 == 1) {
                System.out.println("Snake eyes");
            }
        }

        // check if die1 is between 2 and 5 inclusive
        if (2 <= die1 && die1 <= 5) {
            System.out.println("Die 1 is between 2 and 5 inclusive.");
        }

        if (die1 != 1 || die2 != 1) {
            System.out.println("At least one die was not a one");
        }

        if (die1 != 1) {
            System.out.println("Die 1 was not a one");
        }
        else if (die2 != 1) {
            System.out.println("Die 2 was not a one");
        }

        // check to see if we have exactly one 1
        if ((die1 == 1 || die2 == 1) && (die1 != die2)) {
            System.out.println("We have exactly one 1");
        }
    }

}
