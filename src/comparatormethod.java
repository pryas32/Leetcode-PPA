import java.util.Arrays;
import java.util.Comparator;

public class comparatormethod {

        public static void main(String args []){
            String arr[]={"oohan","rohan","alphabet","null","null"};

            Arrays.sort(arr, Comparator.reverseOrder());

            System.out.printf(Arrays.toString(arr));

System.out.printf("_____________________________________________________");

            Arrays.sort(arr, Comparator.nullsFirst(Comparator.naturalOrder()));
            System.out.printf(Arrays.toString(arr));
        }

    }
