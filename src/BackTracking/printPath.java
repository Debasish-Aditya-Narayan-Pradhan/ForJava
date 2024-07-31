package BackTracking;

public class printPath {
    public static void main(String[] args) {
        int r = 2;
        int c = 2;
        boolean[][] isVisited = new boolean[r][c];
        printMaze(0,0,r-1,c-1,"",isVisited);
    }

    private static void printMaze(int sr, int sc, int er, int ec,String s,boolean[][] isVisited) {
        if(sr > er || sc > ec || sc < 0 || sr < 0)
        {
            return;
        }
        if(isVisited[sr][sc] == true) return;
        if(sr == er && sc == ec)
        {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        printMaze(sr,sc+1,er,ec,s+"R",isVisited);
        printMaze(sr+1,sc,er,ec,s+"D",isVisited);
        printMaze(sr,sc-1,er,ec,s+"L",isVisited);
        printMaze(sr-1,sc,er,ec,s+"U",isVisited);

        isVisited[sr][sc] = false;



    }
}
