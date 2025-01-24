import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class anomyous_class {

    //anomnour class ->they are class witghout any name .

    public static void fun(Collection<Integer>c, Predicate<Integer >p){

        for(Integer i:c){

            if(p.test(i))//this will map to below abstract function definition
            {
                System.out.println(i);
            }
        }


    }//
//

    public static void main(String args[]){

        // a functional interface can act as an anonymous class object when instantiated
        // using an anonymous class. In this case, you provide an implementation for the
        // single abstract method defined in the functional interface.
        Predicate<Integer>a=new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x%2==0;
            }
        };

        //we created object of predicate type above

        List<Integer> l=new ArrayList<>(Arrays.asList(12,23,34,45));

        fun(l,a);  //passing object of Predicate type


    }
//

}




