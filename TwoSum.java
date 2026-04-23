import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();

        int[] nums = {0,1,2,3,4};
        int target = 6;

        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }
        return new int[0];
    }
}
