package JavaFund;

import java.util.Scanner;

public class zeroOneTwo {
    private  static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void sortArr(int[] arr)
    {
        int st = 0;

        int ed = arr.length-1;
        while(arr[st] == 0)
        {
            st++;
        }
        while(arr[ed] == 2)
        {
            ed--;
        }

        int mid = st;
        while(mid <= ed) {
            if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 0) {
                swap(arr, mid, st);
                st++;
            } else {
                swap(arr, mid, ed);
                ed--;
            }
        }
    }
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
        sortArr(arr);

        System.out.print("After sorting [");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]);
            if(i != n-1)
            {
                System.out.print(" ,");
            }
        }
        System.out.println("]");
    }
}
