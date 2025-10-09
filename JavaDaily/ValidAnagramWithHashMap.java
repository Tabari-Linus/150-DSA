import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class ValidAnagramWithHashMap {
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s;
        String t;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first string:");
            s = scanner.nextLine();
            System.out.println("Enter the second string:");
            t = scanner.nextLine();
        }
        System.out.println(isAnagram(s, t));
    }

}
