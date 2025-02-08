import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSorting {


    public static void main(String args[]){

// we can sort only list inertfae using collcetiosn


        List<Integer>l= Arrays.asList(12,234,1,11);
        Collections.sort(l);
        System.out.println(l);

Collections.sort(l,Collections.reverseOrder());// we can pass Collections.reverseOrder() as a comparator for non primitve type
//but not for user defined type we cant use comparator .
System.out.println(l);







    }










}
