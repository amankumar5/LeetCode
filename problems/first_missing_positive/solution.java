class Solution {
    public int firstMissingPositive(int[] nums) {
        Map map= new HashMap<Integer,Integer>();
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                map.put(nums[i],1);
                if(max<nums[i])
                    max=nums[i];
            }
        }
        for(int i=1;i<=max;i++)
        {
            if(!map.containsKey(i))
            {
                return i;
            }
        }
        return max+1;
    }
}