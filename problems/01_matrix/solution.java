class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if(mat == null || mat.length == 0)
            return mat;
        int m = mat.length;
        int n = mat[0].length;
        Queue<int[]> que = new LinkedList<int[]>();
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(mat[i][j]==0)
                {
                    que.offer(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }
        int[][] dir = {{-1,0},{1,0},{0,1},{0,-1}};
        while(!que.isEmpty())
        {
            int size = que.size();
            for(int i = 0; i < size; i++)
            {
                int[] cur = que.poll();
                int curx=cur[0];
                int cury=cur[1];
                for(int j = 0; j < 4;j++)
                {
                    int x =curx+dir[j][0];
                    int y =cury+dir[j][1];
                    if(x>=0 && x<m && y>=0 && y<n && !visited[x][y])
                    {
                        mat[x][y] = mat[curx][cury] + 1;
                        visited[x][y]= true;
                        que.offer(new int[]{x,y});
                    }
                }
            }
        }
        return mat;
    }
}