class Solution {
    private void dfs(int row,int col,boolean[][]vis,char[][]board)
    {
        int m = board.length;
        int n = board[0].length;
        vis[row][col] = true;
        int[] dx = new int[]{0,0,1,-1};
        int[] dy = new int[]{1,-1,0,0};
        for(int k=0;k<4;k++)
        {
            int nx = row + dx[k];
            int ny = col + dy[k];
            if(nx >=0 && nx<m && ny>=0 && ny<n && board[nx][ny] == 'O' && !vis[nx][ny])
            {
                dfs(nx,ny,vis,board);
            }
        }
    }
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][]vis = new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            if(board[i][0] == 'O' && !vis[i][0])
            {
                dfs(i,0,vis,board);
            }
            if(board[i][n-1] == 'O' && !vis[i][n-1])
            {
                dfs(i,n-1,vis,board);
            }
        }
        for(int j=0;j<n;j++)
        {
            if(board[0][j] == 'O' && !vis[0][j])
            {
                dfs(0,j,vis,board);
            }
            if(board[m-1][j] == 'O' && !vis[m-1][j])
            {
                dfs(m-1,j,vis,board);
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j] == 'O' && !vis[i][j])
                {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
