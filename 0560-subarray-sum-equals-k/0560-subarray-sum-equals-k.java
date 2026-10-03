class Solution {
    public int subarraySum(int[] nums, int k) {

        int count = 0;
        int len = nums.length;

        for (int left = 0; left < len; left++) {

            int sum = 0;

            for (int i = left; i < len; i++) {

                sum += nums[i];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}