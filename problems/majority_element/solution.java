class Solution {
    public int majorityElement(int[] nums) {
        int e = nums[0],c = 1;
        for(int i=1;i<nums.length;i++) {
            if(e == nums[i]) c++;
            else c--;
            if(c == 0) { 
                e = nums[i];
                c = 1; }
        }
        return e;
    }
}