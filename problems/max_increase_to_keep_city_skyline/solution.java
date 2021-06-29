class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] columnMax = new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(rowMax[i]<grid[i][j])
                    rowMax[i] = grid[i][j];
                if(columnMax[i]<grid[j][i])
                    columnMax[i]=grid[j][i];
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(rowMax[i]>columnMax[j]){
                    sum+=(columnMax[j]-grid[i][j]);
                    grid[i][j]=columnMax[j];
                }
                else{
                    sum+=(rowMax[i]-grid[i][j]);
                    grid[i][j]=rowMax[i];
                }
                
            }
        }
        return sum;
    }
}