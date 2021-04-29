import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];
            for(int j=i+1; j<nums.length;j++)
            {
                System.out.println(i+" "+j+" "+diff);
                System.out.println(nums[j]);
                if(nums[j]==diff){
                 int[] intArray = new int[2];
                intArray[0]=i;
                intArray[1]=j;
                return intArray;
                }
            }
        }
        return new int[2] ;
    }
}