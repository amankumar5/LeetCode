class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] result = new int[r][c];
        if(m*n == r*c && m!=r && n!=c)
        {
           int row=0,column=0; 
           for(int i = 0;i<m;i++)
           {
               for(int j=0;j<n;j++)
               {
                   result[row][column++] = mat[i][j];
                   if(column==c)
                   {
                       column=0;
                       row++;
                   }
                   
               }
           }
            return result;
        }
        else
            return mat;
        
        
    }
}