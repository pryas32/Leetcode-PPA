import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {

    public static void main(String args[]){
        Collection<Integer> c = new ArrayList<Integer>();
        //size()
        //isEmpty()
        //contains
        //add
        //remove
        //toArray()
        //iterator

        c.add(12);
        c.add(23);
        c.add(34);
        c.add(45);



        //iterator in collections

        Iterator <Integer>it=c.iterator();

        while(it.hasNext()){
            System.out.println(it.next());//moves iterator to a next position
        }

System.out.println("System.out.println");







        System.out.println(c.size());
        System.out.println(c.isEmpty());
        System.out.println(c.contains(12));
        System.out.println(c.remove(12));

    Object arr[]=c.toArray(); //for converting collections to arr of object
System.out.println(c);

c.forEach(System.out::println);

















    }












}
