package Pattern;

import java.util.HashMap;
import java.util.Map;

public class equivaletTriangle
{
    public static void main(String[] args) {
        int r = 5;
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 1; i <= r; i++)
        {
            for(int k = i+1; k <= r; k++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = r; i >=1; i--)
        {
            for(int k = i+1; k <= r; k++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
