package BackTracking;

public class printPathWithBlock {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int[][] maze = {{1,0,1},
                        {1,1,1},
                        {0,1,1}};
        printMaze(0,0,row-1,col-1,"",maze);
    }

    public static void printMaze(int sr,int sc,int er,int ec,String s,int[][] maze)
    {
        if(sr < 0 || sc < 0) return;
        if(sr > er || sc > ec) return;
        if(maze[sr][sc] == 0) return;

        if(sr == er && sc == ec)
        {
            System.out.println(s);
            return;
        }
        printMaze(sr,sc+1,er,ec,s+"L",maze);
        printMaze(sr+1,sc,er,ec,s+"D",maze);
    }
}
