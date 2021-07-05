class Solution {
    static int findMaxofRow(int a[],int maxSum)
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE;
 
        for (int i = 0; i < size; i++)
        {
            int temp_sum =0;
            for(int j=i;j<size;j++)
            {
               temp_sum+=a[j];
               if(temp_sum<=maxSum && temp_sum>max_so_far)
               max_so_far = temp_sum;
            }
        }
        return max_so_far;
    }
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rowSize = matrix.length;
        int columnSize = matrix[0].length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<rowSize; i++)
        {
            int[] maxOfRow = new int[columnSize];
            for(int j=i;j<rowSize; j++)
            {
                for(int rowItr = 0; rowItr<columnSize; rowItr++)
                {
                    if(matrix[j][rowItr]==k)
                        return k;
                    maxOfRow[rowItr] +=matrix[j][rowItr]; 
                    if(maxOfRow[rowItr] == k)
                        return k;
                }
               
            int tempMax = findMaxofRow(maxOfRow,k);
            if(tempMax > maxSum )
            {
                
                maxSum = tempMax;
            }
            }
            
            
        }
        return maxSum;
    }
}