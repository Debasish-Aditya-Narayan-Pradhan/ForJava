import java.util.*;

class stackImp<T>
{
    static int size = 0;
    class Node
    {
        T data;
        Node next;

        Node(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void push(T x)
    {
        Node temp = new Node(x);
        if(head == null)
        {
            head = temp;
        }
        else
        {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    public T pop()
    {

        if(head == null)
        {
            System.out.println("Underflow...");
            return null;
        }
        T x = head.data;
        head = head.next;
        size--;
        return x;
    }
    public int size()
    {
        return size;
    }
    public void display()
    {
        if(head == null)
        {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = head;
        while(temp!= null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public T peek()
    {
        if(head == null)
        {
            return null;
        }
       return head.data;
    }
}
public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackImp<String> st = new stackImp<>();
        st.push("s");
        st.push("b");
        st.display();

    }
}
