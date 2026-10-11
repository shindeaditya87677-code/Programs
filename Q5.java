//check whether two strings are anagrams
public class Q5 {
    public static boolean isAnagram(String first, String second) {
        first = first.replaceAll(" ", "").toLowerCase();
        second = second.replaceAll(" ", "").toLowerCase();
        if (first.length() != second.length()) {
            return false;
        }
        int[] letterCounts = new int[26];
        for (int i = 0; i < first.length(); i++) {
            letterCounts[first.charAt(i) - 'a']++;
            letterCounts[second.charAt(i) - 'a']--;
        }
        for (int count : letterCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
  public static void main(String[] args) {
        String first = "listen";
        String second = "silent";       
        System.out.println(isAnagram(first, second));
    }
}