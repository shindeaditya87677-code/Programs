public class Q8 {
    public static void main(String[] args) {
        String text = "racecar";
        boolean result = isPalindrome(text);
        
        System.out.println(result);
    }
    public static boolean isPalindrome(String s) {
        return checkPalindrome(s, 0, s.length() - 1);
    }
    private static boolean checkPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return checkPalindrome(s, left + 1, right - 1);
    }
}