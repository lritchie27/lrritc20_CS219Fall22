package ArrayExamples;

import java.util.Arrays;

public class SelectionSort {

    /*
     * Return the index of the smallest item in the array
     */
    public static int smallest_loc(int start, int [] aoi) {
        int smallest = aoi[start];
        int s_index = start;
        for (int i = start + 1; i < aoi.length; i++) {
            if (aoi[i] < smallest) {
                smallest = aoi[i];
                s_index = i;
            }
        }
        return s_index;
    }

    public static int [] sort(int [] aoi) {
        for (int i = 0; i < aoi.length - 1; i++) {
            int j = smallest_loc(i, aoi);
            int temp = aoi[i];
            aoi[i] = aoi[j];
            aoi[j] = temp;
        }
        return aoi;
    }

    /*
     * Return true if aoi is in ascending order
     * False otherwise
     */
    public static boolean isOrdered(int [] aoi) {
        for (int i = 0; i < aoi.length - 1; i++) {
            if (aoi[i] > aoi[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(smallest_loc(0, new int[] {4, 1, 9, -1, 6}) == 3);
        System.out.println(smallest_loc(4, new int[] {4, 1, 9, -1, 6}) == 4);
        System.out.println(smallest_loc(2, new int[] {4, 1, 9, -1, 6}) == 3);

        System.out.println();

        int [] aoi = {4,1,9,2,-1,6};
        System.out.println(Arrays.toString(sort(aoi)));
        System.out.println(isOrdered(sort(aoi)));

    }

}
