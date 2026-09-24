import java.util.*;

class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(50);

        System.out.println(pq.poll());
    }
}
