import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stream_sum {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(12, 23, 34, 45));

        int sum1 = l.stream()// here sum,min,max average etc are applied on primitive data type not on non primitive data type therefrore we need to
//    //convert here from non-primitive ie Integer to int ie from arraylist to array
                .mapToInt(Integer::intValue) // Convert Integer to int for summing
                .sum();

        System.out.println(sum1); // Output: 114
    }
}
