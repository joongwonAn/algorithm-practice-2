package com.ajw.strig;

/*
 * 출처: https://leetcode.com/problems/valid-palindrome-ii/submissions/1823868611/
 */

public class ValidPalindrome2 {
    public static void main(String[] args) {
        ValidPalindrome2 palindrome = new ValidPalindrome2();
        String s1 = "aba";
        System.out.println("output1: " + palindrome.validPalindrome(s1));

        String s2 = "abca";
        System.out.println("output2: " + palindrome.validPalindrome(s2));

        String s3 = "abc";
        System.out.println("output1: " + palindrome.validPalindrome(s3));
    }

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return (isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1));
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left <= right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}
