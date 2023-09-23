package ArraysRecursion;

import java.util.Scanner;
public class ArraysRecursion {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 5, 5};
        printArray(array, 0);

        int sum = arraySum(array, 0);
        System.out.println("Sum of array elements: " + sum);

        int what = 5;
        int count = findCountInArray(array, what, 0);
        System.out.println("Count of element " + what + " is " + count);

        printString("Hello");

        String str = reverseString("Hello");
        System.out.println(str);
    }

    public static void printArray(int[] array, int i) {
        if (i >= array.length) {
        } else {
            System.out.println(array[i]);
            printArray(array, i + 1);
        }
    }
    public static int arraySum(int[] array, int i) {
        if (i >= array.length) {
            return 0;
        }
        return array[i] + arraySum(array, i + 1);
    }
    public static int findCountInArray(int[] array, int what, int i) {
        if (i >= array.length) {
            return 0;
        } else if (array[i] == what) {
            return 1 + findCountInArray(array, what, i + 1);
        } else
            return findCountInArray(array, what, i+1);
    }
    public static void printString(String s) {
        int count = 0;
        count++;
        if (count > s.length()) {
            return;
        }
        System.out.println(s.charAt(0));
        printString(s.substring(1));
        System.out.println(s.charAt(0));
    }
    public static String reverseString(String s) {
        int count = 0;
        count++;
        if (count > s.length()) {
            return "";
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
