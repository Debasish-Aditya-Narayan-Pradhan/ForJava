package Iterators;

import java.util.*;

public class vectorAndIterator {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);
        System.out.println(vector);
        List<Integer> ll = new ArrayList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        //Enumeration<Integer> enu = vector.elements();
        //Enumeration -> read
        //Iterator -> read,remove
        //ListIterator -> read,remove,set
        ListIterator<Integer> it = ll.listIterator();
        while (it.hasNext())
        {
            Integer data = it.next();
            if(data == 2)
            {
                it.remove();
            }
            System.out.println(data);
        }
        System.out.println(ll);
    }
}
