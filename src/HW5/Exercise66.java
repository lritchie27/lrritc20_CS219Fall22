/*
 * Logan Ritchie
 * HW 5
 * Due 10/6/2022
 */

package HW5;

public class Exercise66 {

    public static boolean canSpell(String word, String tiles) {
        boolean valid = true;

        // check to see if letter in word is in tiles
        for (int i = 0; i < word.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < tiles.length(); j++) {
                if (word.charAt(i) == tiles.charAt(j)) {
                    // take out that letter from tiles
                    tiles = tiles.substring(0,j) + tiles.substring(j+1);
                    // increase the counter to 1
                    cnt++;
                    // exit out of the for loop
                    break;
                }
            } // end for loop
            if (cnt != 1) {
                // the letter from word was not in tiles
                valid = false;
            }
        } // end for loop
        return valid;
    }

    public static void main(String [] args) {
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("logan", "abjldcogttamn"));
        System.out.println(!canSpell("tea", "hbdtefgjl"));
        System.out.println(canSpell("teaspoon", "abceponjtows"));
    }

}
