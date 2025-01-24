import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class method_refrence_part_1 {

    // we can pass class name as method refrence but method need to be static



    public static void main(String args []){

        List <Integer>l=new ArrayList<>(Arrays.asList(12,34,45,23));


   l.forEach(method_refrence_part_1::square);




    }


    public static void square(Integer p)
    {
       System.out.println(p*p);
    }









}
