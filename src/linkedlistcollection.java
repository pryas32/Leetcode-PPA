import java.util.LinkedList;

public class linkedlistcollection {


    public static void main(String args []) {


        LinkedList<Integer> l=new LinkedList<>();
        l.add(12);
        l.add(23);
        l.add(34);
        l.add(2,45);
l.get(1);

System.out.println(l.size());

System.out.println(l);


    //time complexity of methods of linkedlist
//        add();->O(index);
//        add(index,x)->O(1);
//
//        remove()->O(index)-> as we need to travel till that index
//                isEmpty->O(1)
//        O(1)->in case of arraylist    get()->O(index);
//            O(1)->in case of arraylist set()->O(index);
//



//arraylis is cache friendly and also in queue and dequeue the functions are (add remove ,element) throws exception
//ie offer peek and poll when want a value .


    }
}
