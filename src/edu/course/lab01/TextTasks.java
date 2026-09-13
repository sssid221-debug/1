package edu.course.lab01;

public class TextTasks {

    public static String reverse(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(text.charAt(left))
                    != Character.toLowerCase(text.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}