package String;

import java.util.*;

public class strlength {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i= 0; i < 3; i++)
        {
            List<Integer> ll = new ArrayList<>();
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Enter a no: ");
                int x = sc.nextInt();
                ll.add(x);
            }
            ans.add(ll);
        }

        int sum = 0;
        for(List<Integer> l:ans)
        {
            for(int i :l)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
