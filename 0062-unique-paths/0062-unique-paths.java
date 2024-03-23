class Solution {
    public int uniquePaths(int m, int n) {
        
        int dp[] [] =  new int[m][n];
        
        for(int i  = 0; i < m ; i++)
        {
            Arrays.fill(dp[i] , -1);
        }
        
        return pathshelper(m-1 ,n-1 , dp);
    }
    
    public static int pathshelper(int sr , int sc , int[][]dp)
    {
        if(sc < 0 || sr < 0)
        {
            return 0;
        }
        
        if(sc == 0 || sr == 0)
        {
            return 1;
        }
        
        if(dp[sr][sc] != -1)
        {
            return dp[sr][sc];
        }
        
        
        int path1  = pathshelper(sr-1 , sc , dp);
        int path2  = pathshelper(sr , sc - 1 , dp);
        
        
        dp[sr][sc] = path1+path2;
        
        
        return path1+path2;
        
    }
}