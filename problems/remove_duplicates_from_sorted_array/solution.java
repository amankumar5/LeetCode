class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        if(len==0 || len == 1)
            return len;
        int j=0;
        for(int i=0;i<len-1;i++)
            if(nums[i]!=nums[i+1])
                nums[j++]=nums[i];
        nums[j++]=nums[len-1];
        
        return j;
        
       
    }
}