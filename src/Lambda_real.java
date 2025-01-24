import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Lambda_real {

//

    public static void fun(Collection<Integer> c, Predicate<Integer>p){

        for(Integer i:c)
            if(p.test(i)){
                System.out.println(i);
            }


    }



    public static void main(String args[]){


        List<Integer>l= new ArrayList<>(Arrays.asList(12,23,34,45,56));

        //passsing implemetation here itself
        fun(l,x->x%2==0);


    }



}//
