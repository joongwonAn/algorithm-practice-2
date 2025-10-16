package com.ajw.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.doBinarySearch(array, target));
    }

    private int doBinarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else { // array[mid] > target
                high = mid - 1;
            }
        }
        return -1;
    }
}
