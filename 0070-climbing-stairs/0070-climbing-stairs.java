class Solution {
    public int climbStairs(int n) {
        
//         int dp [] =  new int[n+1];
        
//         Arrays.fill( dp ,  - 1);
//         return climbStairs(n , dp);
        
         
        if(n == 1) return 1;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }


        return dp[n];
        
       
    }
    
//     public int climbStairs(int n , int dp[])
//     {
//         if(n == 1 || n == 2)
//         {
//             return n;
//         }
        
        
        
//         int temp1 = climbStairs( n - 1, dp);
//         int temp2  = climbStairs(n -2 , dp);
        
//         dp[n] = temp1 + temp2;
        
//         return dp[n];
//     }
}