import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class lambda_expression {
//lambda_expression ->they are used for uimplementing abstract method of functional interface
    //functional interface ->they do have exactly one abstract method
    //and can have many default mthod



    //functonal interface example ->runnable interface where we need to implement only run method
    //interface Predicate<T>
    // {
    //abstract boolean test(T t);
    // }

    //this is simple way through which we were working earlier wutout lambda expression.
    public static void fun(Collection<Integer> C, Predicate<Integer> p) {

        for (Integer i : C) {

            if (p.test(i)) {   //here it get passed and applied  each value of collection p read apply abstract method implementation
                System.out.println(i);
            }
//
//
        }
    }


    public static void main(String args[]){

        class mynew implements Predicate<Integer>{

            @Override
            public boolean test(Integer x) {//here this function get passed there above
                return x%2==0;
            }
        }

        List<Integer> l=new ArrayList<>(Arrays.asList(10,23,34,50));

        fun(l,new mynew());//passing object of mynew here as it implement predicate so can be recieedv in predicate argument.


    }







}
