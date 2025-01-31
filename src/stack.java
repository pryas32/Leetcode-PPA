import java.util.ArrayDeque;

public class stack {

    //internally stack is implemnted using arraydeque

    public static void main(String args[]) {


        ArrayDeque<Integer> arr = new ArrayDeque<>();
        arr.push(12);
arr.push(11);
arr.push(45);
arr.push(67);
arr.push(78);//it works on LIFO structure last in first out.
System.out.println(arr.size());
System.out.println(arr.isEmpty());

System.out.println(arr.peek());

System.out.println(arr.pop());











    }




}
