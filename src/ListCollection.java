import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListCollection {

    public static void main(String args[]){


        List<Integer>l=new ArrayList<>();

        //method in list

        l.add(12);
        l.add(23);
        l.add(34);
        l.add(45);
        l.set(1,2);
        System.out.println(l.contains(45));
      //  l.remove(2);
System.out.println("hello world");

        //list has iterator which can help it to move forward as well as backward
//list also gives previousindex() and nextIndex();
        Iterator<Integer>it=l.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

System.out.println("hello world");

        ListIterator<Integer> it2 = l.listIterator(l.size());
        while (it2.hasPrevious()) {
            System.out.println(it2.previous());
        }





















    }






}
