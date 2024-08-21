package javaEight;

interface  A
{
    public int sum(int a,int b);
}
public class lamdaExpression {
    public static void main(String[] args) {
        A a = (e,b)->
        {
            return e+b;
        };
        System.out.println(a.sum(3,4));
    }
}
