import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_quue {

    public static void main(String args []){


        //its by default a min heap priority queue


     //   PriorityQueue<Integer>p=new PriorityQueue<>();//its min heap priority queue
     //max heap priority queue

PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());//for max heap push Collections.reverseOrder() in constructor .

       p.add(12);
        p.add(10);
        p.add(1);
        p.add(20);
        System.out.println(p.peek());


        System.out.println(p.poll());



        System.out.println(p.isEmpty());














    }









}
