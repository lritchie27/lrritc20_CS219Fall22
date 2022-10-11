package ArrayExamples;

import java.util.Arrays;
import java.util.Random;

public class Examples {

    // int is called a primitive type
    // so is boolean, double, long, short
    // char, long, byte
    // arr is called a reference type (passed by reference)
    public static void f(int x) {
        x = 7;
    }

    // function to fill an array of integers
    // with random values between 1 and 10 inclusive
    public static void fill_random(int [] arr) {

        // random number generator
        Random rng = new Random();
        rng.setSeed(10);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rng.nextInt(1, 11);  // randomly picks a number
                                                      // 1-10 to fill the array
        }

    }

    public static void print_array(int [] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println("]");
    }

    public static void print_array2(int [] arr) {
        System.out.print("[");

        // enhanced for loop
        // for each value v in the array arr
        for (int v : arr) {
            System.out.print(v + ", ");
        }
        System.out.println("]");
    }

    // return the sum of the values in the array
    public static int sum2(int [] arr) {
        int total = 0;
        for (int v : arr) {
            total = total + v;
        }
        return total;
    }

    public static int sum(int [] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    public static int sum3(int [] arr) {
        int total = 0;
        int i = 0;

        while (i < arr.length) {
            total = total + arr[i++];  // very common idiom
        }
        return total;
    }

    // write a function that returns the average of an array of integers
    public static double average(int [] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static double median(int [] arr) {
        Arrays.sort(arr);  // put the array in number order
        double median;
        if (arr.length % 2 == 0) {
            int i = arr.length / 2;
            median = (arr[i] + arr[i - 1]) / 2.0;
        }
        else {
            int j = arr.length / 2;
            median = arr[j];
        }
        return median;
    }

    public static void main(String [] args) {

        int [] nums = {4, 1, 0, 9, 3, 2, 8};
        int [] grades = new int[10];  // allocate space for 10 grades

        System.out.println(nums[2]);  // prints out the 3rd number
        // System.out.println(nums[-1]); // IndexOutOfRange error

        fill_random(grades);
        System.out.println(Arrays.toString(grades));
        print_array(grades);
        print_array2(grades);
        System.out.println();

        System.out.println(sum(grades) == 48);
        System.out.println(sum2(grades) == 48);
        System.out.println(sum3(grades) == 48);
        System.out.println(average(grades) == 4.8);
        System.out.println(median(grades) == 4.5);

        System.out.println();

        int z = 33;
        f(z);  // when z is passed to x, a copy is made
        System.out.println(z);

    }

}
