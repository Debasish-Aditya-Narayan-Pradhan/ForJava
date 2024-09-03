package Pattern;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class practice {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        pq.add(10);
        pq.add(3);
        pq.add(7);
        pq.add(2);

        while(pq.size() > 0)
        {
            System.out.println(pq.poll());
        }

    }
}
