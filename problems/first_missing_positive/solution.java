class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0){
                System.out.println("nums[i]"+nums[i]);
                arr[j]=nums[i];
                j++;
            }
        }
       
          for (int i = 0; i < j; i++) {
            int x = Math.abs(arr[i]);
            if (x - 1 < j && arr[x - 1] > 0)
                arr[x - 1] = -arr[x - 1];
        }
 
        for(int i=0;i<j;i++)
        {
            if(arr[i]>=0)
                return i+1;
        }
        return j+1;
    }
}