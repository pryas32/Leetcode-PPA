import java.util.*;

public class Collectionsing {

    //collection->they are static class and can be used by using instance of collection.
    //min()->they hae 2 version one normal amnd second through comprator
    //max()->it has 2 version  one normal and second through comparator
    //disjoint(l1,l2)->if there is no such common element they return as true else false.
    //binary_search();
    //fill()
    //copy(l1,l2)
//replace()
  //reverse();
  //one more method known as collections.reverseOrder();
  //replaceall()
  //rotate()
  //swap()
  //sort()->sort as per your convinence.
    //reverseOrder()->used for collections like arraylist,linkedlist,priorityqu we can make priority queue of max as well of min.

     //synchronisedlist()
    //synchronizedmap();
    //synchronizedset();
    //they are applied on arraylist,linkedlist they dont modify orignal arraylist ,linekedlist the are wrapper on same arraylist ,linkedlist.
    //they are used in multithreaded env.it not recommended to modigy these container inmultithreaded env.
    //unmodificablelist()
    //unmodificablemap()
    //unmiodificableset()
    //for immutable version of list ,map and set we can pass it to some fumction for modification.


    public static void main(String args[]){

        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);


        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);



    }

}
