import java.util.ArrayList;
import java.util.Collection;

import static java.util.Locale.filter;

public class Collectiontraversal {

    //first method was iterator for traversing over collection
    //in that we have remove ror removing element from iterator over collections
   public static void main(String args []) {
       Collection<Integer>c=new ArrayList<>();
       c.add(12);
       c.add(23);
       c.add(34);
       c.add(45);

//lambda expression used for implementing the abstract method of functional interface
       c.forEach(System.out::println);//for each method


       //third way of traversal is through stream
System.out.println("hello ");
c.stream()
       .filter(x->x%2==0)
        .forEach(System.out::println);







   }
}
