import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentElements {
 
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortedEntries = freqMap.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toList());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = sortedEntries.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        TopKFrequentElements solver = new TopKFrequentElements();
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        int[] result = solver.topKFrequent(nums1, k1);
        System.out.println(Arrays.toString(result));
    }
}
