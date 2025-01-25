import java.util.Arrays;

public class max_in_array {



    public static void main(String args[]) {
        int arr[] = {12, 23, 34, 45, 56};


        int maximum = Arrays.stream(arr).max().getAsInt();//here we cant do directly arr.stream()
        //this we can do for non promitive ata type

        //for primitive data type we need to create stream on it
        //like this Arrays.stream(arr);

System.out.print(maximum);

        //ultity functuon moin,max, etc for primitive data type.

    }

}
