import java.util.Arrays;
import java.util.List;

public class stream {
    //stream was introduced in java8 for readable ,maintainable code.
    //it works perfectly fine with lambda expression and method references
    //in stream we have source
    //we have intermediate function
    //we hav terminal functions



    //like we need to print stream for numbers greater than 10

    public static void main(String args[]){
        List<Integer> l= Arrays.asList(10,23,34,45,56);//source
        l.stream()
                .filter(x->x%2==0)//intermediate steps
                .filter(x->x>10)
                .forEach(System.out::println);//terminal steps
    }




//for each elements passes through filter function then print that element.









}
