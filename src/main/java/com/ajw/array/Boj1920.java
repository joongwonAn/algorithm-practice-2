package com.ajw.array;

public class Boj1920 {
    public static void main(String[] args) {
        // init
        int n = 5;
        int[] arrayA = new int[]{4, 1, 5, 2, 3};

        int m = 5;
        int[] target = new int[]{1, 3, 7, 9, 5};

        Boj1920 boj1920 = new Boj1920();
        for (int t : target) {
            System.out.println(boj1920.doBinarySearch(arrayA, t));
        }
    }

    private int doBinarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int pivot = (low + high) / 2;
            if (array[pivot] == target) {
                return 1;
            } else if (array[pivot] < target) {
                low = pivot + 1;
            } else { // array[pivot] > target
                high = pivot - 1;
            }
        }
        return 0;
    }
}
