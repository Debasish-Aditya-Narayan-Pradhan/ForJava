package BackTracking;

public class mazePath {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        int count = maze(1,1,r,c);
        System.out.println(count);
    }

    private static int maze(int sr, int sc, int er, int ec) {
        if(sr > er || sc > ec)
        {
            return 0;
        }
        if(sr == er && sc == ec)
        {
            return 1;
        }

        int countRight = maze(sr,sc+1,er,ec);
        int countDown = maze(sr+1,sc,er,ec);
        int totalCount = countRight + countDown;
        return totalCount;
    }
}
