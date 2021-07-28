class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        while(arr.size() < n)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int ele : arr){
                if(2*ele -1 <= n)
                    temp.add(2*ele -1);

            }
            for(int ele : arr){
                if(2*ele <= n)
                    temp.add(2*ele);
            }
            arr=temp;
        }
        int[] ans = new int[n];
        for(int i =0 ;i<n;i++)
        {
            ans[i]=arr.get(i);
        }
        return ans;
    }
}