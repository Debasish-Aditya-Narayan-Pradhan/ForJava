package Tictack;

import java.util.Scanner;

public class RockPaperSeazer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        char[] computerChoice = {'R','P','S'};
        do {

            System.out.println("Do you want to play:)\n1:Yes\n0:No\nEnter your choice: ");
            ch = sc.nextInt();

            int cmC = (int)Math.floor(Math.random()*3);
            if (ch == 1)
            {
                System.out.println("Rock->R\nPaper->P\nSeazer->S\nEnter your choice");
                String userChoice = sc.next();
                if(userChoice.equals(computerChoice[cmC]+""))
                {
                    System.out.println("--------------------");
                    System.out.println("You won:))))");
                    System.out.println("------------------------");
                }
                else
                {
                    System.out.println("--------------------");
                    System.out.println("Computer won!!");
                    System.out.println("--------------------");
                }
            }
            else
            {
                System.out.println("You have quited:)");
            }

        }  while (ch !=0);
    }
}
