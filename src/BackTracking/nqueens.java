package BackTracking;

public class nqueens {
    private static boolean isSafe(char[][] b,int row,int col)
    {
        int n = b.length;
        for(int i = 0; i < n; i++)
        {
            if(b[row][i] == 'Q') return false;
        }

        for(int i = 0; i < n; i++)
        {
            if(b[i][col] == 'Q') return false;
        }

        int i = row;
        int j = col;
        // check for northEast
        while(i>=0 && j < n)
        {
            if(b[i][j] == 'Q') return false;
            i--;
            j++;
        }

        i = row;
        j = col;
        //check for southEast
        while(i < n && j < n)
        {
            if(b[i][j] == 'Q') return false;
            i++;
            j++;
        }

        i = row;
        j = col;
        //check for nothWest
        while(i >=0 && j >= 0)
        {
            if(b[i][j] == 'Q') return false;
            i--;
            j--;
        }

        i = row;
        j = col;
        //check for southWest
        while(i <  n && j >= 0)
        {
            if(b[i][j] == 'Q') return false;
            i++;
            j--;
        }

        return true;
    }
    private static void nqueen(char[][] b,int row)
    {
        int n = b.length;
        if(row == n)
        {
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    System.out.print(b[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < n; i++)
        {
            if(isSafe(b,row,i))
            {
                b[row][i] = 'Q';
                nqueen(b,row+1);
                b[row][i] = 'X';
            }
        }

    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                board[i][j] = 'X';
            }
        }

        nqueen(board,0);

    }
}
