class Solution {
    public int removeDuplicates(int[] nums) {
       int c = 1;
        for(int i = 2; i < nums.length; i++) {
            if(nums[c - 1] == nums[c] && nums[i] == nums[c]) {
                continue;
            }
            nums[++c] = nums[i];
        }
        return c + 1;
    }
}