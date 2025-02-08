import java.util.stream.Stream;

public class stream_example {
//print first n naturnal number starting with 5


    public static void main(String args []) {


        Stream.iterate(1, x -> x + 1)
                .filter(x->x.toString().contains("5"))   //integer to string
                .limit(10)  ///it will move till 10 answre doesnt get count
                .forEach(System.out::println);

    }




}
