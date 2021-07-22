class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] leftMax = new int[n];
        leftMax[0] = nums[0];
        int[] rightMin = new int[n];
        rightMin[n-1] = nums[n-1];
        for(int i = 1; i < n;i++)
        {
            if(leftMax[i-1] < nums[i]){
                leftMax[i] = nums[i];
            }
            else{
                leftMax[i] = leftMax[i-1];
            }
            
            if(rightMin[n-i] > nums[n-i-1]){
                rightMin[n-i-1] =nums[n-i-1];
            }
            else{
                rightMin[n-i-1] =  rightMin[n-i];
            }
        }
        for(int i = 1; i<n;i++)
        {
            if(leftMax[i-1]<=rightMin[i])
                return i;
        }
        return -1;
    }
}