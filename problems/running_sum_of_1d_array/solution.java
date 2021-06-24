class Solution {
    public int[] runningSum(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]+=a;
            a=nums[i];
        }
        return nums;
    }
}