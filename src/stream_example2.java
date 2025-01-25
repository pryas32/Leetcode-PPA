import java.util.Arrays;

public class stream_example2 {
    //sort string acc to a and end with e

public static void main(String args []){


    String[]arr={"aee","aae","ale"};


   // arr.stream() ->Note cant do this as correct, String itself does not implement the Stream API. Let me clarify:0

Arrays.stream(arr)
        .filter(x->x.startsWith("a"))
        .filter(x->x.endsWith("e"))
        .sorted()
        .forEach(System.out::println);






}






}
