class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n-2; i++)
        {
            for(int j = i+1; j < n-1; j++)
            {
               int k = j+1;
                int l = n-1;
                while(k<l)
                {
                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum == target)
                    {
                        List<Integer> li = new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        set.add(li);
                        k++;
                        l--;
                    }
                    if(sum > target)
                        l--;
                    if(sum < target)
                        k++;
                }
            }
        }
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.addAll(set);
        return list;
        
    }
}