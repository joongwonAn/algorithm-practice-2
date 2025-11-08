package com.ajw.strig;

/*
 * 문제 출처: https://leetcode.com/problems/valid-palindrome/
 */

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome palindrome = new ValidPalindrome();
        String input = "A man, a plan, a canal: Panama";
        System.out.println("output: " + palindrome.isPalindrome(input));
        System.out.println("output: " + palindrome.isPalindromeOptimize(input));
    }

    public boolean isPalindrome(String s) {
        System.out.println("s:" + s);

        String cleanInput = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println("cleanInput:" + cleanInput);

        int low = 0;
        int high = cleanInput.length() - 1;
        while (low < high) {
            if (cleanInput.charAt(low) == cleanInput.charAt(high)) {
                low++;
                high--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeOptimize(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            while (low < high && !Character.isLetterOrDigit(s.charAt(low))) {
                low++;
            }

            while (low < high && !Character.isLetterOrDigit(s.charAt(high))) {
                high--;
            }

            if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
                return false;
            }

            low++;
            high--;
        }
        return true;
    }
}
