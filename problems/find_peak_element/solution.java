class Solution {
    public int findPeak(int[] nums,int l, int h,int n)
    {
        int mid = (l+h)/2;
        if((mid==0 || nums[mid-1]<nums[mid]) && (mid==n-1 || nums[mid+1]<nums[mid]))
            return mid;
         else if (mid > 0 && nums[mid - 1] > nums[mid])
            return findPeak(nums, l, (mid - 1), n);
        else
            return findPeak(nums, (mid+1),h, n);
    }
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        return findPeak(nums,0,nums.length-1,len);
    }
}