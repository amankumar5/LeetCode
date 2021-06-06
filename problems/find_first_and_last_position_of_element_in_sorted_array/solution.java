class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end =nums.length;
        int index=-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                index=mid;
                break;
            }
            if(target<=nums[mid])
            {
                end=mid;
            }
            else
                start=mid+1;
        }
        if(index==-1){
            int[] arr = {-1,-1};
            return arr;
        }
        else
        {
            int fix1 =index;
            int fix2 =index;
            if(fix1>0)
            while(nums[fix1-1]==target)
            {
                
              fix1--;
                if(fix1==0)
                    break;
            
            }
            if(fix2<nums.length-1)
            while(nums[fix2+1]==target)
            {
                fix2++;
                if(fix2==nums.length-1)
                    break;
            }
            int[] arr = {fix1,fix2};
            return arr;
                
        }
    }
}