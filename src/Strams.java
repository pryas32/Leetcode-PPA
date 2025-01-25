import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//example of streams
public class Strams {
    //it refers to the fumctions or pipeline which is applied on collectiosn
    //it makes the code reable ,efficient ,short




    public static void main(String args []){


        List<Integer> l=new ArrayList<>(Arrays.asList(12,23,34,45,56));

        l.stream()
                .filter(x->x%2==0)
                .filter(x->x>10)
                .forEach(System.out::println);






    }






}
