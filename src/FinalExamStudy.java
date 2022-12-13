import java.util.ArrayList;
import java.util.Arrays;

public class FinalExamStudy {

    // public static void f(int n, int [] arr1, int [] arr2) {
        // arr1[4] = n;
        // n = arr2[3];
        // arr2[n] = 23;
    //}

    //public static void main(String[] args) {
        //int [] vec = {4,5,6,7,8,9};
        //int x = 2;
        //f(x, vec, vec);
        //System.out.printf("%d %s\n", x, Arrays.toString(vec));  // array index out of bounds error
    //}

    public static char toUpper(String s) {
        char ch = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                ch = (char) ((ch - 'a') + 'A');
                break;
            }
        }
        return ch;
    }

    public static ArrayList<Integer> twosum(ArrayList<Integer> nums, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(-32 % 7);  // -4
        System.out.println(Math.floorMod(-32, 7));  // 3
        System.out.println(2 / 4);  // 0
        System.out.println(Math.floorDiv(-2, 4)); // -1

        System.out.println(Math.floorMod(-15, 12));

        int ch = 'F';
        ch = 'a' + (ch - 'A');
        System.out.println(ch);  // 102
        System.out.println((char) ch);  // f

        int ch1 = 'f';
        ch1 = (ch - 'a') + 'A';
        System.out.println(ch1);  // 70
        System.out.println((char) ch1);  // F

        System.out.println(toUpper("hello"));
        System.out.println(toUpper("HEllo"));

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(7);
        nums.add(11);
        nums.add(15);
        System.out.println(nums);
        System.out.println(twosum(nums, 17));

    }

}
