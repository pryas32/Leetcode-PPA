public class examples_of_functional_interface {

    Predicate which has only one functional interface


    interface Predicate<T>
    {
        boolean test(T t);
    }


    //for comparator

    interface comparator<T>{
        boolean compare(T a,T b);
    }












}
