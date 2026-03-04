class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        if(row==0) return 0;
        int island=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    island++;
                }
            }
        }
        return island;
         
        
    }
    public void dfs(char[][] grid,int i,int j)
    {
        int row=grid.length;
        int col=grid[0].length;
        if(i<0||j<0||i>=row||j>=col||'0'-grid[i][j]==0)
        {
          return ;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);

    }
}