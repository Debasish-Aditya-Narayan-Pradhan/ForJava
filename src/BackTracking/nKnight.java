package BackTracking;

public class nKnight {
    public static int a = 8;
    public static boolean isSafe(char[][] board,int row,int col)
    {
        int n = board.length;
        int i,j;
        // 2Up 1right
        i = row-2;
        j = col+1;
        if(i >= 0 && j < n && board[i][j] == 'K') return false;
        //2Up 1left
        i = row-2;
        j = col-1;
        if(i >= 0 && j >=0 && board[i][j] == 'K') return false;
        //2Down 1right
        i = row+2;
        j = col+1;
        if(i < n && j < n && board[i][j] == 'K') return false;
        //2Down 1left
        i = row+2;
        j = col-1;
        if(i < n && j >= 0 && board[i][j] == 'K') return false;
        //2right 1up
        i = row-1;
        j = col+2;
        if(i >= 0 && j < n && board[i][j] == 'K') return false;
        //2right 1down
        i = row+1;
        j = col+2;
        if(i < n && j < n && board[i][j] == 'K') return false;
        //2left 1up
        i = row+1;
        j = col-2;
        if(i < n && j >= 0 && board[i][j] == 'K') return false;
        //2left 1down
        i = row-1;
        j = col-2;
        if(i >= 0 && j >=0 && board[i][j] == 'K') return false;

        return  true;
    }
    public static void helper(char[][] board,int row,int col,int num)
    {
        int n = board.length;
        if(row == n)
        {
           if(num == a)
           {
               for(int i = 0; i < n; i++)
               {
                   for(int j = 0; j < n; j++)
                   {
                       System.out.print(board[i][j]);
                   }
                   System.out.println();
               }
               System.out.println();
           }
            return;
        }
        else if(isSafe(board,row,col))
        {
            board[row][col] = 'K';
            if(col != n-1)  helper(board,row,col+1,num+1);
            else  helper(board,row+1,0,num+1);
            board[row][col] = 'x';
        }
        if(col != n-1)  helper(board,row,col+1,num);
        else  helper(board,row+1,0,num);

    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                board[i][j] = 'x';
            }
        }
        helper(board,0,0,0);

    }
}
