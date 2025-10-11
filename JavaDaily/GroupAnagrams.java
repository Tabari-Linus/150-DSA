import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String s : strs) {
            
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

             anagramMap.putIfAbsent(sortedString, new ArrayList<>());

            anagramMap.get(sortedString).add(s);
        }

        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        GroupAnagrams solver = new GroupAnagrams();
        String[] strs1 = {"act", "pots", "tops", "cat", "stop", "hat"};
        List<List<String>> result1 = solver.groupAnagrams(strs1);
        System.out.println("Example 1: " + result1);
    }
}