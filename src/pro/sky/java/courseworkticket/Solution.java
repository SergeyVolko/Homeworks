package pro.sky.java.courseworkticket;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
    }

    public static int[] getArray(int[] arr) {
        int first = 3;
        int last = 7;
        if (arr.length < last) {
            throw new IllegalArgumentException("Не верный размер массива.");
        }
        int[] result = new int[5];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
            if (i >= first - 1 && i < last) {
                result[index++] = arr[i];
            }
        }
        return result;
    }
}
