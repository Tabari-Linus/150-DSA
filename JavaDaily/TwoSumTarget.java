import java.util.Scanner;

public class TwoSumTarget {
    
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                System.out.print("Enter Element " + (i + 1) + ": ");
                nums[i] = scanner.nextInt();
            }
            System.out.print("Enter the target value: ");
            int target = scanner.nextInt();
            int[] result = twoSum(nums, target);
            if (result.length == 0) {
                System.out.println("No two numbers found that add up to the target value.");
            } else {
                System.out.println("The indices of the two numbers are: " + result[0] + " and " + result[1]);
            }
        }
    }
}
