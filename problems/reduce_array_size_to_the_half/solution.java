class Solution {
    
    public int minSetSize(int[] arr) {
    Arrays.sort(arr);
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
                map.put(arr[i],0);
            map.put(arr[i],map.get(arr[i])+1);
        }
        int[] valueArr = new int[map.size()];
        int u=0;
       for (Integer key: map.values()) {
            valueArr[u++]=key;
        }
        Arrays.sort(valueArr);
        int N=n;
        int setSize=0;
        for(int i = u-1;i>=0;i--)
        {
            if(N<=n/2)
                break;
            N-=valueArr[i];
            setSize++;
        }
       
        
        
        return setSize;
        
    }
    
}