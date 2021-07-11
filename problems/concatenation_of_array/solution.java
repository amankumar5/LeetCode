class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        int k=0;
        for(int i = 0;i<n;i++)
        {
            arr[k]=nums[i];
            arr[n+k]=nums[i];
            k++;
        }
        return arr;
    }
}