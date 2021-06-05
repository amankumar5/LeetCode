class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        int n= nums.length, i;
        for (i=0;i<n;i++)
        {
            if(nums[i]>=target){
                index=i;
                break;
            }
        }
        if(i==n)
            index=n;
        return index;
    }
}