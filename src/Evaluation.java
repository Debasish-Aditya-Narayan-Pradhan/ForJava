import java.util.*;

public class Evaluation {
    static  int eval(String str)
    {
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57)
            {
                int val = ascii- 48;
                st.push(val);
            }
            else if(op.size() == 0 || ch == '(' || op.peek()=='(')
            {
                op.push(ch);
            }
            else if(ch == ')')
            {
                while(op.peek() != '(')
                {
                    int v2 = st.pop();
                    int v1 = st.pop();
                    char o = op.pop();

                    if(o == '+')
                    {
                        int cal = v1+v2;
                        st.push(cal);
                    }
                    if(o == '-')
                    {
                        int cal = v1-v2;
                        st.push(cal);
                    }
                    if(o == '*')
                    {
                        int cal = v1*v2;
                        st.push(cal);
                    }
                    if(o == '/')
                    {
                        int cal = v1/v2;
                        st.push(cal);
                    }
                }

                op.pop();
            }
            else
            {
                if(ch == '+' || ch == '-')
                {
                    int v2 = st.pop();
                    int v1 = st.pop();
                    if(op.peek() == '+')
                    {
                        int cal = v1+v2;
                        st.push(cal);
                        op.pop();
                        op.push(ch);
                    }
                    if(op.peek() == '-')
                    {
                        int cal = v1-v2;
                        st.push(cal);
                        op.pop();
                        op.push(ch);
                    }
                    if(op.peek() == '*')
                    {
                        int cal = v1*v2;
                        st.push(cal);
                        op.pop();
                        op.push(ch);
                    }
                    if(op.peek() == '/')
                    {
                        int cal = v1-v2;
                        st.push(cal);
                        op.pop();
                        op.push(ch);
                    }
                }

                if(ch == '*' || ch == '/')
                {
                    if(op.peek() == '*' || op.peek() == '/')
                    {
                        int v2 = st.pop();
                        int v1 = st.pop();
                        if(op.peek() == '*')
                        {
                            st.push(v1*v2);
                        }

                        if(op.peek() == '/')
                        {
                            st.push(v1/v2);
                        }
                        op.pop();
                        op.push(ch);
                    }
                    else
                    {
                        op.push(ch);
                    }

                }
            }
        }

        while(st.size() > 1)
        {
            int v2 = st.pop();
            int v1 = st.pop();

            if(op.peek() == '+') st.push(v1+v2);
            if(op.peek() == '*') st.push(v1*v2);
            if(op.peek() == '-') st.push(v1-v2);
            if(op.peek() == '/') st.push(v1/v2);

            op.pop();

        }

        return st.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        str = str.trim();
        System.out.println(eval(str));
    }
}
