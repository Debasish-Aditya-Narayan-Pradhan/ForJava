package CNS;

import java.util.Scanner;

public class Enc_Dcy {
    public static String encryption(String str,String key)
    {
        char[] keyAlp = new char[str.length()];
        int k = 0;
        for(int i = 0; i < str.length(); i++)
        {
            k = k%(key.length());
            keyAlp[i] = key.charAt(k);
            k++;
        }
        System.out.println();
        char[] alp = str.toCharArray();
        char[] alpOrg = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String encryptedStr = "";
        for(int i = 0; i < alp.length ; i++)
        {
            int x=0;
            int y=0;
            for(int j = 0; j < alpOrg.length; j++)
            {
                if(alpOrg[j] == alp[i])
                {
                    x = j;
                }

            }
            for(int j = 0; j < alpOrg.length; j++)
            {
                if(alpOrg[j] == keyAlp[i])
                {
                    y = j;
                }

            }

            encryptedStr+=alpOrg[(x+y)%26];

        }

        return encryptedStr;
    }

    public static String decryption(String str,String key)
    {
        char[] keyAlp = new char[str.length()];
        int k = 0;
        for(int i = 0; i < str.length(); i++)
        {
            k = k%(key.length());
            keyAlp[i] = key.charAt(k);
            k++;
        }
        System.out.println();
        char[] alp = str.toCharArray();
        char[] alpOrg = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String encryptedStr = "";
        for(int i = 0; i < alp.length ; i++)
        {
            int x=0;
            int y=0;
            for(int j = 0; j < alpOrg.length; j++)
            {
                if(alpOrg[j] == alp[i])
                {
                    x = j;
                }

            }
            for(int j = 0; j < alpOrg.length; j++)
            {
                if(alpOrg[j] == keyAlp[i])
                {
                    y = j;
                }

            }

            encryptedStr+=alpOrg[((x-y)+26)%26];

        }

        return encryptedStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String strCpy = str;
        str = str.toUpperCase();
        System.out.print("Enter the key: ");
        String key = sc.nextLine();
        key = key.toUpperCase();
        String s = encryption(str,key);
        System.out.println("Cipher text is: "+s);
        String s1 = decryption(s,key);

        if(str.equals(s1))
        {
            System.out.println("Decrypted text is: "+strCpy);
        }
    }
}
