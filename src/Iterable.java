import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public interface  Iterable {

//Collection is an interface which extends Iterface which returns an object which has iterator method which
//    has functions like next(),hasNext(),remove().


public static void main(String args []){

    Collection <Integer>c=new ArrayList<>();
    c.add(10);
    c.add(20);
    c.add(30);
    c.add(11);
    c.add(13);
    c.add(15);
    c.add(17);


    removeduplicates(c);
}


public static void removeduplicates(Collection<Integer>c){

    Iterator<Integer> it=c.iterator();
   Collection<Integer>c1=new ArrayList<>();
    while(it.hasNext()){
        int i=it.next();

        if(i%2==0)
        {
            it.remove();
        }
else{
    c1.add(i);// we can add primitive to non primitive because of autoboxing
        }


    }

    Iterator <Integer> a=c1.iterator();

    while(a.hasNext())
    {
        System.out.println(a.next());
    }



}




}
