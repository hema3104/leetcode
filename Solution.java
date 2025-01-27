class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no solution is found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        // Test the twoSum method
        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15}; // Example array
        int target = 9; // Example target

        int[] result = solution.twoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
