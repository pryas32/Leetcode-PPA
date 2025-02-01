import java.util.*;

public class Set {
    public static void main(String args[]){

        //set ->it donst include duplicate values
        //it ignores duplicates values

        java.util.Set<Integer> s=new HashSet<>();
        s.add(12);
        s.add(12);
        s.add(23);
        s.add(12);
        System.out.println(s.size());
        System.out.println(s.contains(34));
        System.out.println(s.contains(12));
        System.out.println(s.remove(12));


System.out.println("hello world");


        java.util.Set<Integer> s1=new HashSet<>();
        s1.add(12);
        s1.add(12);
        s1.add(23);
        s1.add(12);
        System.out.println(s.contains(s1));
        System.out.println(s.addAll(s1));
        System.out.println(s.removeAll(s1));
        System.out.println(s.size());


        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(12,34,546,67,12,12,12,12));
       java.util.Set<Integer> s4=new HashSet<Integer>(arr);//this will create set hof array having unique value in it.
        System.out.println(s4);


        Iterator<Integer>it=s4.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

//hashset ->it removes all  the duplicates when to use this when we want lowest time complecity
        //like O(1)
        //in such casees used this



    }

















}
