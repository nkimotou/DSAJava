import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // example in leetcode book
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (map.containsKey(target - x)) {
                return new int[]{map.get(target - x), i};
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Example input array and target
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method
        int[] result = solution.twoSum(nums, target);

        // Print the result
        System.out.println("Indices of the two numbers whose sum is equal to target:");
        System.out.println(Arrays.toString(result));
    }
}
