class Solution {
    public int[][] transpose(int[][] matrix) {
       int n= matrix.length;
        int m= matrix[0].length;
        int[][] matout = new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matout[j][i]=matrix[i][j];
            }
        }
        return matout;
    }
}