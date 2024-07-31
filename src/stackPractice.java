import java.util.*;

public class stackPractice {
    public static void main(String[] args) {
        Stack<String>  val = new Stack<>();
        Stack<Character>   op = new Stack<>();
        String str = "9-(5+3)*4/6";
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57)
            {
                val.push(ch+"");
            }
            else if(op.size() == 0 || ch == '(' || op.peek() == '(')
            {
                op.push(ch);
            }
            else if(ch == ')')
            {
                while(op.peek() != '(')
                {
                    String s = "";
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    s = o+v1+v2;
                    val.push(s);
                }
                op.pop();
            }
            else
            {
                if(ch == '+' || ch == '-')
                {
                    String s = "";
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    s = o+v1+v2;
                    val.push(s);
                    op.push(ch);
                }

                if(ch == '*' || ch == '/')
                {
                    if(op.peek() == '*' || op.peek() == '/')
                    {
                        String s = "";
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        s = o+v1+v2;
                        val.push(s);
                        op.push(ch);
                    }
                    else
                    {
                        op.push(ch);
                    }
                }
            }

        }

        while(val.size() > 1)
        {
            String s = "";
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            s = o+v1+v2;
            val.push(s);
        }

        System.out.println(val.peek());
    }


}
