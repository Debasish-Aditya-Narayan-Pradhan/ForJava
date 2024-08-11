package BackTracking;

import java.util.LinkedList;
import java.util.List;

public class printParmutation {
   public static void printP(String s,String b,List l)
   {
       if(s.equals(""))
       {
           l.add(b);
           return;
       }
       for(int i = 0; i < s.length();i++)
       {
           char ch = s.charAt(i);
           String left = s.substring(0,i);
           String right = s.substring(i+1);
           String rem = left+right;
           printP(rem,b+ch,l);
       }
   }
    public static void main(String[] args) {
        String str = "abc";
        List<String> ll = new LinkedList<>();
        printP(str,"",ll);
        for(String l:ll)
        {
            System.out.println(l);
        }
    }
}
