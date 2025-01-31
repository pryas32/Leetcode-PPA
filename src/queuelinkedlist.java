import java.util.LinkedList;
import java.util.Queue;

public class queuelinkedlist {

    public static void main(String args []){

        //queue using linkelist(FIFO strcture)

        Queue<Integer>q=new LinkedList<>();
        q.offer(12);
        q.offer(23);
        q.offer(34);
        q.offer(45);
        System.out.println(q.peek());
        System.out.println(q.poll());

        System.out.println(q.size());
        System.out.println(q.isEmpty());


// we prefer arraydequeu over linkedlist for queue implementation as its cahe friendly and also functiosn like set() and get() are O(1) in arraydequeue.









    }





}
