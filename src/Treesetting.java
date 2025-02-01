import java.util.TreeSet;

public class Treesetting {

    public static void main (String args[]){
        TreeSet<Integer>t=new TreeSet<>();
        t.add(23);
        t.add(11);
        t.add(23);
        t.add(11);
        t.add(5);

        System.out.println(t.floor(1));//if not present will return as  null//floor return lower or equal to value if present.
        System.out.println(t.ceiling(1));//return value greater or equals
        System.out.println(t.lower(10));
        System.out.println(t.higher(10));


        System.out.println(t);
        System.out.println(t.size());

        System.out.println(t.contains(11));
        System.out.println(t.remove(11));
System.out.println(t);


//it maintains sorted orders it implemnte red black self balancing binary search tree
        //it uses function such as lower high floor ceiling.when we want those we can use this







    }








}
