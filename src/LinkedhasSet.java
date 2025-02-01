import java.util.LinkedHashSet;

public class LinkedhasSet {


    public static void main(String args[]){
        LinkedHashSet<Integer>h=new LinkedHashSet<>(5);//decalred size of linkedhashset
//it is used when we want in order of insertion
        //it is implemented using doubly linkedlist.

h.add(11);
        h.add(167);
        h.add(9);
h.add(23);
h.add(11);

System.out.println(h);
System.out.println(h.contains(34));
System.out.println(h.remove(11));

System.out.println(h.isEmpty());
System.out.println(h.size());




       // O(1) in all cases. Timne complexity



    }







}
