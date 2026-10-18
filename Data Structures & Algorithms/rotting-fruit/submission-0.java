class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        int minutes = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1) fresh++;
                else if(grid[i][j] == 2) q.offer(new int[]{i,j});
            }
        }
        if(fresh == 0) return minutes;
        int[] dx = new int[]{0,0,1,-1};
        int[] dy = new int[]{1,-1,0,0};
        while(!q.isEmpty() && fresh > 0)
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                int[] arr = q.poll();
                int r = arr[0];
                int c = arr[1];
                for(int k=0;k<4;k++)
                {
                    int nx = r + dx[k];
                    int ny = c + dy[k];
                    if(nx>=0 && nx<m && ny>=0 && ny<n && grid[nx][ny] == 1)
                    {
                        grid[nx][ny] = 2;
                        q.offer(new int[]{nx,ny});
                        fresh--;
                    }
                }
            }
            minutes++;
        }
        if(fresh == 0) return minutes;
        else return -1;
    }
}
