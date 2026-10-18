class Solution {
    private void dfs(int row,int col,boolean[][]vis,char[][]grid)
    {
        int m = grid.length;
        int n = grid[0].length;
        vis[row][col] = true;
        int[] dx = new int[]{0,0,1,-1};
        int[] dy = new int[]{1,-1,0,0};
        for(int k=0;k<4;k++)
        {
            int nx = row + dx[k];
            int ny = col + dy[k];
            if(nx>=0 && nx<m && ny>=0 && ny<n && grid[nx][ny] == '1' && !vis[nx][ny])
            {
                dfs(nx,ny,vis,grid);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int islands = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == '1' && !vis[i][j])
                {
                    dfs(i,j,vis,grid);
                    islands++;
                }
            }
        }
        return islands;
    }
}
