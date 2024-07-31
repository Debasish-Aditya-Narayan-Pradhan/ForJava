package Tictack;

import java.util.*;

public class tictack {
    static Scanner sc = new Scanner(System.in);
    static boolean t = false;
    public static void createTicTac(String[][] ticTac)
    {
    for(int i = 0; i < 3; i++)
        {
            System.out.print(i+"-> ");
            for(int j = 0; j < 3; j++)
            {
                if(j != 2)
                {
                    System.out.print(ticTac[i][j]+" | ");
                }
                if(j == 2)
                {
                    System.out.print(ticTac[i][j]);
                }
            }
            if(i !=2)
            {
                System.out.println("\n-------------");
            }
        }

        System.out.println();

    }
    public static boolean checkWinner(String[][] ticTac)
    {
        if(!ticTac[0][0].equals(" ") && ticTac[0][0].equals(ticTac[0][1]) && ticTac[0][1].equals(ticTac[0][2]))
        {
            System.out.println(ticTac[0][0]+" won:)");

            return true;
        }
        if(!ticTac[0][0].equals(" ")&&ticTac[0][0].equals(ticTac[1][0]) && ticTac[1][0].equals(ticTac[2][0]))
        {
            System.out.println(ticTac[0][0]+" won:)");

            return true;
        }
        if(!ticTac[0][0].equals(" ")&&ticTac[0][0].equals(ticTac[1][1]) && ticTac[1][1].equals(ticTac[2][2]))
        {
            System.out.println(ticTac[0][0]+" won:)");

            return true;
        }
        if(!ticTac[0][2].equals(" ")&&ticTac[0][2].equals(ticTac[1][1]) && ticTac[1][1].equals(ticTac[2][0]))
        {
            System.out.println(ticTac[0][2]+" won:)");

            return true;
        }
        if(!ticTac[1][0].equals(" ")&&ticTac[1][0].equals(ticTac[1][1]) && ticTac[1][1].equals(ticTac[1][2]))
        {
            System.out.println(ticTac[1][0]+" won:)");
            return true;
        }
        if(!ticTac[2][0].equals(" ")&&ticTac[2][0].equals(ticTac[2][1]) && ticTac[2][1].equals(ticTac[2][2]))
        {
            System.out.println(ticTac[2][0]+" won:)");
            return true;
        }
        if(!ticTac[0][1].equals(" ")&&ticTac[0][1].equals(ticTac[1][1]) && ticTac[1][1].equals(ticTac[2][1]))
        {
            System.out.println(ticTac[0][1]+" won:)");
            return true;
        }
        if(!ticTac[0][2].equals(" ")&&ticTac[0][2].equals(ticTac[1][2]) && ticTac[1][2].equals(ticTac[2][2]))
        {
            System.out.println(ticTac[0][2]+" won:)");
            return true;
        }

        return  false;
    }
    public static boolean checkAllFilled(String[][] ticTac)
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(ticTac[i][j].equals(" "))
                {
                    return true;
                }
            }
        }

        return false;
    }
    public static boolean checkBox(String[][] ticTac,int i ,int j)
    {
        if(i < 0  || i > 2  || j < 0 || j > 2 || !ticTac[i][j].equals(" "))
        {
            System.out.println("Invalid move!!!");
            return false;
        }

        return  true;

    }
    public static void startGame(String[][] ticTac)
    {

         int x = 0;
         char c =' ';
        while(checkAllFilled(ticTac))
        {
            if(x == 0)
            {
                c = 'X';
                x = 1;
            }
            else
            {
                c = '0';
                x = 0 ;
            }
            System.out.println(c+" Player Enter (row,colomn): ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            while (!checkBox(ticTac,row,col))
            {
                System.out.println(c+" Player Enter (row,colomn): ");
                row = sc.nextInt();
                col = sc.nextInt();
            }
            ticTac[row][col] = c+"";
            createTicTac(ticTac);
            t = checkWinner(ticTac);
            if(t)
            {
                break;
            }
        }
        if(!t)
        {
            System.out.println("Draw..............");
        }
    }
    public static void main(String[] args) {
        String[][] ticTac = new String[3][3];
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Do you want to play\n1:Yes\n0:No\nEnter your choice: ");
            ch = sc.nextInt();
            if(ch == 1) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        ticTac[i][j] = " ";
                    }
                }
                createTicTac(ticTac);
                System.out.println();
                startGame(ticTac);
            }
        }while (ch != 0);
    }
}
