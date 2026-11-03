class Solution {
    public int minMoves(int[] nums) {
        int changes =0;
        Arrays.sort(nums);
        int min = nums[0];
        for(int num : nums){
            changes += num - min;
        }
        return changes;
    }
}