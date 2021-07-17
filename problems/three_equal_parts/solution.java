class Solution {
    public int[] threeEqualParts(int[] arr) {
        int ones = 0;
        int n = arr.length;
        int[] DeAns = {-1,-1};
        for(int i = 0; i < n; i++)
            if(arr[i] == 1)
                ones++;
        if(ones == 0)
            return new int[] {0,n-1};
        if(ones % 3 != 0)
            return DeAns;
        int target = ones/3;
        int p1 = 0, p2 = 0, p3 = 0;
        int count = 0;
        for(int i = 0; i < n ;i++)
        {
            if(arr[i] == 1)
            {
                if(count == 0)
                    p1 = i;
                if(count == target)
                    p2 = i;
                if(count == 2*target)
                    p3 = i;
                count++;
            }
            
        }
        int p11 = p1;
        int p22 = p2;
        int p33 = p3;
        while(p11 < p2 && p22 < p3 && p33 <n)
        {
            if(arr[p11] != arr[p22] || arr[p22] != arr[p33])
                return DeAns;
            else{
                p11++;
                p22++;
                p33++;
            }
             
        }
        if(p33 == n)
            return new int[] {p11-1,p22};
        else
            return DeAns;
        
    }
}