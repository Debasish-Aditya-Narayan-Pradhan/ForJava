package VictoryGame;

import java.util.Scanner;

class player
{
    int level = 1;
    String name;
    int health = 100;

    public void profile()
    {
        System.out.println("Name: "+name);
        System.out.println("Level: "+level);
    }
}
class enemy
{
    String[] arr = {"Gobline","Giant","Hulk"};
    String[] atk = {"punch","kick"};
    int health = 100;
}
public class fightingGame {
    static Scanner sc = new Scanner(System.in);
    public static void status(player pl,enemy e)
    {
        System.out.println("Your Health: "+pl.health);
        System.out.println("Enemy Health: "+e.health);
    }
    public static void Attack(player p,enemy e,int en)
    {
        System.out.print("1:punch\n2:Kick\nEnter your choice: ");
        int ch = sc.nextInt();
        while(ch != 1 && ch != 2)
        {
            System.out.print("1:punch\n2:Kick\nEnter your choice: ");
             ch = sc.nextInt();
        }
        if(p.health > 0 && e.health > 0)
        {

            if(ch == 1) e.health -=10;
            if(ch == 2) e.health -=30;
            if(e.health < 0)
            {
                e.health = 0;
            }
        }

        if(en == 0 && p.health > 0 && e.health > 0)
        {
            int r = (int)(Math.floor(Math.random()*2));
            System.out.println("Enemy attack was "+e.atk[r]);
            if(r == 0) p.health -=10;
            if(r == 1) p.health -=40;
            if (p.health < 0)
            {
                p.health = 0;
            }
        }
        if(en == 1 && p.health > 0 && e.health > 0)
        {
            int r = (int)(Math.floor(Math.random()*2));
            System.out.println("Enemy attack was "+e.atk[r]);

            if(r == 0) p.health -=20;
            if(r == 1) p.health -=50;
            if (p.health < 0)
            {
                p.health = 0;
            }
        }
        if(en == 2 && p.health > 0 && e.health > 0)
        {
            int r = (int)(Math.floor(Math.random()*2));
            System.out.println("Enemy attack was "+e.atk[r]);
            if(r == 0) p.health -=30;
            if(r == 1) p.health -=60;
            if (p.health < 0)
            {
                p.health = 0;
            }
        }

        status(p,e);
    }
    public static void startGame(player p,enemy e)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        p.name = name;
        int r = (int)(Math.floor((Math.random()*3)));
        System.out.println("Your enemey "+e.arr[r]);
        while(p.health >0 && e.health >0)
        {
            Attack(p,e,r);
        }
        if(p.health > 0)
        {
            System.out.println(p.name+" Congratulation you won the match");
            p.level +=1;
        }
        else
        {
            System.out.println("Try next time you lost the game!");
        }
        p.health = 100;
        e.health = 100;

    }
    public static  void profile(player p)
    {
        System.out.println("-----------------------------------");
        System.out.println("Name: "+p.name);
        System.out.println("Level: "+p.level);
        System.out.println("-----------------------------------");

    }
    public static void main(String[] args) {

        enemy e = new enemy();
        player p = new player();
        int ch = 0;
        do {
            System.out.print("Do you want to play:\n1:yes\n2:no\n3:See Profile\nEnter your choice: ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:startGame(p,e);
                      break;
                case 2:break;
                case 3:profile(p);
                      break;
                default:
                    System.out.println("Invalid choice!");
            }

        }while (ch!=2);
    }
}
