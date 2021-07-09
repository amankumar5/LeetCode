class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] LIS = new int[n];
        int max=1;
        for(int i=0;i<n;i++)
            LIS[i]=1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j] && LIS[i]<LIS[j]+1)
                {
                    LIS[i]=LIS[j]+1;
                    if(LIS[i]>max)
                max=LIS[i];
                }
            }
        }
        
        return max;
    }
}