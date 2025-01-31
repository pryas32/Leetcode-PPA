import java.util.ArrayDeque;
import java.util.Queue;

public class queue {

    public static void main(String args []){

        //for queue we have arraydequeue and linkedlist


Queue<Integer> q=new ArrayDeque<>();
q.offer(12);
q.offer(23);
q.offer(34);
q.offer(45);

System.out.println(q.peek());
System.out.println(q.poll());


System.out.println(q.size());
System.out.println(q.isEmpty());











    }









}
