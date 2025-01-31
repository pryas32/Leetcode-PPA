import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class dequeusinglinkedlist {

    public static void main(String args[]){
        Deque<Integer>q=new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//
//
//        Iterator<Integer>it=q.descendingIterator();//it gives iterator from the last index.
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }


        q.offerFirst(1);
        q.offerFirst(2);
        q.offerFirst(3);
        q.offerFirst(4);
System.out.println(q.size());

        Iterator<Integer>it=q.descendingIterator();//it gives iterator from the last index.

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}


