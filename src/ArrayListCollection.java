import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListCollection {

    public static void main(String args[]){

        ArrayList<Integer>arr=new ArrayList<>();

        //it has functions like
        //add
        //set

        /// contains
        //remove
        //get
        arr.add(12);
        arr.add(3434);
        arr.add(456);
        arr.add(56);

        arr.set(2,100);
        System.out.println(arr.contains(12));
        System.out.println(arr.get(1));

        System.out.println(arr.contains(12));
        System.out.println(arr.lastIndexOf(12));

        ListIterator<Integer>it3= arr.listIterator(arr.size());
System.out.println("____________________________________________");
        while(it3.hasPrevious()){
            System.out.println(it3.previous());
        }

//arraylist is an implementation of dynamic size array which internally uses array
//it uses array of default size and once that array got fill thn creates new array of double its size
//copy old element in new array and then free the old space.


        //as it comlex preocess for that we decalre arraylist of initial size -> which can be treated as of array
        ArrayList<Integer>all=new ArrayList<>(12);//here we decalare arraylist of size 12 initially




        //functions like get ,set  these are O(1);
        //while add(index),remove this involes setting and then shuffling items




//arraylist traversal



        //using foreach method
        arr.forEach(x->System.out.println(x));


//using foreach loop


        for(Integer o:arr){
            System.out.println(o);
        }



        //last is using ListIterator




   ; }






}
