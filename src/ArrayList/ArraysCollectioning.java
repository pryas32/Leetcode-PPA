import java.util.Arrays;
import java.util.Collections;

public class ArraysCollectioning {



    //we cant sort array of primitive type in reverse order

    //for sorting primitve type in reverse order we can convert it inot non primitive

public static void main(String args[]) {
    Integer arr[] = {4, 5, 6, 1, 2, 3};

    Arrays.sort(arr, Collections.reverseOrder());


System.out.println(Arrays.toString(arr));

}


}
