package labtask6;
public class Question1 {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        if (firstChar == lastChar) {
            String substring = str.substring(1, str.length() - 1);
            return isPalindrome(substring);
        }

        return false;
    }

    public static void main(String[] args) {
        String palindromeString = "RACECAR";
        boolean result = isPalindrome(palindromeString);
        if (result) {
            System.out.println(palindromeString + " is a Palindrome String.");
        } else {
            System.out.println(palindromeString + " is not a Palindrome String.");
        }
    }
}
