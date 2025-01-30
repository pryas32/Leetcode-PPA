import java.util.LinkedList;

public class linkedlistcollections {

    public static void main(String args []){


        LinkedList<Integer>l=new LinkedList<>();


        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);


        l.set(1,5);
        System.out.print(l.contains(3));
        l.remove(2);



        l.forEach(System.out::println);

System.out.print("hello world");



linkedlist-> it helps in implementation of arraydequeue and queue
                queue means FIFO whereas arraydequeue ->insertion and deletion at both the ends .

        arraydeqeueu also help in implementation of both dequeue
            and queue

   difference between arraylist and linkedlist Time Complexity

                arraylist && linkedlist

              arraylist  O(n)-> add()->O(1);
                  arraylist---> O(n)-->remove()-> O(1)
               O(1)---> get()--->O(Index)
        arraylist---->O(1)set----->linkedlist





    }










}
