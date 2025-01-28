import java.util.ArrayList;
import java.util.Collection;

public class BulkoperatorColection {

    //syntax
    //boolean cotainsAll(Collection<?> c)//uses equals method of object to check if they have sam,e element or  not
//boolean addall(Collection<? extends E > c)
//removeall(Collection<?> c)
//retainAll(Collection<?> c)
public static void main(String args []){
    Collection<Integer> c=new ArrayList<>();
    c.add(12);
    c.add(23);
    c.add(34);
    c.add(45);


    Collection<Integer> c1=new ArrayList<>();
    c1.add(2);
    c1.add(3);
    c1.add(4);
    c1.add(5);


System.out.println(c.contains(c1));//as c doesnt contains c1

c.addAll(c1);//both should of of same data type or its decendent

for(Object o:c){
    System.out.println(o);
}

c.removeAll(c1);
System.out.println("hello ");
    for(Object o:c){
        System.out.println(o);
    }

Collection c34=new ArrayList<>();
c34.add(12);
c34.add(34);


c.retainAll(c34);

for(Object o:c)
    System.out.println(o);
//
//interface Predicate<T>
//    {
//        abstract boolean test(T x);
//    }


//last is boolean removeif(Predicate<? super E> c)
c.add(23);

    System.out.println("ok");
    System.out.println(c.removeIf(x->x%2==0));//return true if all the element get removed else return false.
//
//for(Object o:c){
//    System.out.println(o);
//}



}



}
