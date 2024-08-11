package NumberSystem;

import java.util.Scanner;

public class NumberSys {
    static Scanner sc = new Scanner(System.in);
    private static int DecimalToBinary(int num)
    {
//        System.out.print("Enter Decimal no: ");
//        int num = sc.nextInt();
          int num1 = num;
        int b = 0;
        int f = 1;
        while(num != 0)
        {
            int r = num % 2;
            b = (r*f) + b;
            f = f*10;
            num = num / 2;
        }
       System.out.println("Binary of "+num1+" from Decimal is: "+b);
        return b;
    }
    public static void BinaryToDecimal()
    {
        System.out.print("Enter Binary value: ");
        int num = sc.nextInt();
        int num1 = num;
        int sum = 0;
        int f = 0;
        while(num != 0)
        {
            int r = num % 10;
            int p = r * ((int)Math.pow(2,f));
            sum = sum + p;
            f++;
            num = num / 10;
        }
        System.out.println("Decimal of "+num1+" from Binary is: "+sum);
    }
    public static void DecimalToOctal()
    {
        System.out.print("Enter the Decimal value: ");
        int num = sc.nextInt();
        int num1 = num;
        int oct = 0;
        int f = 1;
        while(num != 0)
        {
            int r = num % 8;
            oct = (r*f) + oct;
            f = f*10;
            num = num / 8;
        }
        System.out.println("Octal of "+num1+" from Decimal is: "+oct);
    }
    public static void OctalToDecimal()
    {
        System.out.print("Enter number in Octal: ");
        int num = sc.nextInt();
        int num1 = num;
        int f = 0;
        int DecVal = 0;
        while(num != 0)
        {
            int r = num % 10;
            int p = r * ((int)Math.pow(8,f));
            DecVal = DecVal + p;
            f++;
            num = num / 10;
        }
        System.out.println("Decimal of "+num1+" from Octal is: "+DecVal);
    }
    public static void DecimalToHexaDecimal()
    {
        System.out.print("Enter Decimal value: ");
        int num = sc.nextInt();
        int num1 = num;
        int binary = DecimalToBinary(num);
        String Hex = "";
        while(binary != 0)
        {
            int i = 1;
            int d = 0;
            int f = 0;
            while(i <= 4 && binary != 0)
            {
                int r = binary % 10;
                int p = r * ((int)Math.pow(2,f));
                d= d + p;
                f++;
                binary = binary/ 10;
                i++;
            }
            if(d == 10)
            {
                Hex +='A';
            }
            else if(d == 11)
            {
                Hex +='B';
            }
            else if(d == 12)
            {
                Hex +='C';
            }
            else if(d == 13)
            {
                Hex +='D';
            }
            else if(d == 14)
            {
                Hex +='D';
            }
            else if(d == 15)
            {
                Hex +='E';
            }
            else
            {
                Hex +=d;
            }
        }
        StringBuilder s = new StringBuilder(Hex);
        System.out.println(s.reverse());
    }
    public static void BinaryToOctal()
    {
        System.out.print("Enter Binary value: ");
        int num = sc.nextInt();
        int num1 = num;
        int sum = 0;
        int f1 = 1;
        while(num != 0)
        {
            int i = 1;
            int d = 0;
            int f = 0;
            while(i <= 3 && num != 0)
            {
                int r = num % 10;
                int p = r * ((int)Math.pow(2,f));
                d= d + p;
                f++;
                num = num/ 10;
                i++;
            }
            sum = d * f1 + sum;
            f1 *=10;
        }

        System.out.println(sum);
    }
    public static void BinaryToHexaDecimal()
    {
        System.out.print("Enter Binary value: ");
        int num = sc.nextInt();
        int num1 = num;
        String Hex = "";
        while(num != 0)
        {
            int i = 1;
            int d = 0;
            int f = 0;
            while(i <= 4 && num != 0)
            {
                int r = num % 10;
                int p = r * ((int)Math.pow(2,f));
                d= d + p;
                f++;
                num = num/ 10;
                i++;
            }
            if(d == 10)
            {
                Hex +='A';
            }
            else if(d == 11)
            {
                Hex +='B';
            }
            else if(d == 12)
            {
                Hex +='C';
            }
            else if(d == 13)
            {
                Hex +='D';
            }
            else if(d == 14)
            {
                Hex +='D';
            }
            else if(d == 15)
            {
                Hex +='E';
            }
            else
            {
                Hex +=d;
            }
        }
        StringBuilder s = new StringBuilder(Hex);
        System.out.println(s.reverse());
    }
    public static void main(String[] args) {
//        DecimalToBinary();
//        BinaryToDecimal();
        //DecimalToOctal();
        //OctalToDecimal();
        // BinaryToOctal();
       // DecimalToHexaDecimal();
        BinaryToHexaDecimal();

    }
}
