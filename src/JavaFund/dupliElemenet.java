package JavaFund;

import java.util.*;

public class dupliElemenet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements in the array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int s=arr[0];
        for(int i = 1; i < n; i++)
        {
            s = s ^ arr[i];
        }
        System.out.println(s);
    }
}
