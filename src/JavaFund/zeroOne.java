package JavaFund;

import java.util.Scanner;

public class zeroOne {
    private  static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void sortArr(int[] arr)
    {
        int l = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
            {
                swap(arr,l,i);
                l++;
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
