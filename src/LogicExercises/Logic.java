package LogicExercises;

public class Logic {

    public static int caughtSpeeding(int speed, boolean isBirthday) {

        // check if person is speeding
        if (speed < 61) {
            return 0;
        }
        // check if speed is between 61 and 80
        else if (speed <= 80) {

            // check if isBirthday is true and speed < 65
            if (isBirthday && speed <= 65) {
                // no ticket
                return 0;
            }
            else {
                // above if-statement is false so person receives small ticket
                return 1;
            }
        }
        // speed > 80
        else {
            // see if isBirthday is true
            if (isBirthday) {
                // receives small ticket
                return 1;
            }
            else {
                // isBirthday is false...person receives big ticket
                return 2;
            }
        }

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {

        // returns true if either of the statements is true
        // returns false if both are false
        return (isWeekend && cigars >= 40) ||
                (40 <= cigars && cigars <=60);

    }

    public static boolean isOrdered(int d1, int d2, int d3) {

        // returns true if one or both are true
        // returns false if neither are true
        return (d1 < d2 && d2 < d3) || (d3 < d2 && d2 < d1);

    }

    public static void main(String [] args) {

        // check the caughtSpeeding method
        System.out.println(caughtSpeeding(60, false) == 0);
        System.out.println(caughtSpeeding(65, false) == 1);
        System.out.println(caughtSpeeding(65, true) == 0);
        System.out.println(caughtSpeeding(81, false) == 2);
        System.out.println(caughtSpeeding(81, true) == 1);

        // check the cigarParty method
        System.out.println(cigarParty(30, false) == false);
        System.out.println(cigarParty(50, false) == true);
        System.out.println(cigarParty(70, true) == true);

        // check the ordered method
        System.out.println(isOrdered(1, 2, 3) == true);
        System.out.println(isOrdered(3, 2, 1) == true);
        System.out.println(isOrdered(3, 1, 2) == false);

    }

}
