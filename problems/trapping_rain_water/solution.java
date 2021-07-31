class Solution {
    public int trap(int[] height) {
        if(height.length<=0)
            return 0;
        int n = height.length;
        int[] prefixMax =new int[n];
        int[] sufixMax = new int[n];
        prefixMax[0]=height[0];
        sufixMax[n-1]=height[n-1];
        
        for(int i = 1;i < n;i++)
        {
            if(prefixMax[i-1]< height[i])
                prefixMax[i]=height[i];
            else
                prefixMax[i]=prefixMax[i-1];
        }
        for(int i = n-2;i>=0;i--)
        { 
            if(sufixMax[i+1]< height[i])
                sufixMax[i]=height[i];
            else
                sufixMax[i]=sufixMax[i+1];
        }
        int sum = 0;
        for(int i=1;i<n-1;i++)
        {
            System.out.println("prefixMax "+prefixMax[i]+ " sufixMax "+sufixMax[i]+" sum "+ sum);
            int maxHeight = Math.min(prefixMax[i-1],sufixMax[i+1]);
            if(maxHeight > height[i] )
                sum+=(maxHeight-height[i]);
        }
        return sum;
    }
}