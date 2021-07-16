class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        int n = nums.length;
        for(int i = 0; i < n-1; i++)
        {
            int right = n-1;
            int left = i+1;
            while(left < right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0)
                {
                    List<Integer> list = new ArrayList<Integer>(Arrays.asList(nums[i],nums[left],nums[right]));
                    set.add(list);
                    right--;
                    left++;
                }
                else{
                    if(sum < 0)
                        left++;
                    else
                        right--;
                }
            }
        }
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        l.addAll(set);
        return l;
    }
}