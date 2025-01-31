import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.DelayQueue;

public class Dequeu {

public static void main(String args[]){
    Deque<Integer>q=new ArrayDeque<>();
    q.addFirst(12);
    q.addLast(23);
    System.out.println(q.peekFirst());
    System.out.println(q.peekLast());


    System.out.println(q.pollFirst());
    System.out.println(q.size());
    System.out.println(q.isEmpty());
}








}
