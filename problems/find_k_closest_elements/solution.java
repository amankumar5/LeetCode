class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<Integer>();
        int position =-1;
        int len= arr.length;
        for(int i=0;i<len;i++)
        {
            if(x>arr[i]){
                position++;
                continue;
            }
            break;
        }
        position++;
        int minus = position;
        int plus = position;
        if(position>0)
            minus--;
        else
            plus++;
        while(true)
        {
            
            if(k==0)
                break;
            k--;
            
            if((minus>=0) && (plus<len))
            {
                if(Math.abs(arr[minus]-x)<=Math.abs(arr[plus]-x))
                    list.add(arr[minus--]);
                else
                    list.add(arr[plus++]);
                
            }
            else
                if(minus>=0)
                {
                    list.add(arr[minus--]);
                }
                else{
                    list.add(arr[plus++]);
                    
                }
            
        }
        Collections.sort(list);
        return list;
    }
}