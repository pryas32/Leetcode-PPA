import java.util.Arrays;
import java.util.Comparator;

public class comparingalphabet {

    public static void main(String args []){

        String arr[]={"oohan","rohan","alphabet","null","null"};


        Arrays.sort(arr, Comparator.nullsFirst(Comparator.naturalOrder()));


     System.out.printf(Arrays.toString(arr));










    }











}
