class Solution {

    public boolean sol(char[][] board, String word , int row , int col , int n , int m , int in){
        if(in==word.length()){
            return true;
        }
        if(row<0  || col<0  || row>=n  || col>=m  || board[row][col]!=word.charAt(in) || board[row][col]=='!'){
            return false;
        }
        char c=board[row][col];                         
        board[row][col]='!';

        Boolean top =sol(board , word , row , col-1 , n , m  , in+1);
        Boolean right =sol(board , word , row+1 , col , n , m , in+1);
        Boolean left =sol(board , word , row-1 , col , n , m , in+1);
        Boolean down =sol(board , word , row , col+1 , n , m , in+1);

        board[row][col]=c;
        return top || right || left || down ;
    }
    public boolean exist(char[][] board, String word) {
            int in=0;
        int n=board.length;
        int m=board[0].length;
        System.out.println(n+" "+m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(in)){
                if(sol(board , word , i , j , n , m ,in)){
                    return true;
                }}
            }
        }
        return false;
    }
}