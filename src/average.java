import java.util.Arrays;

public class average {


    public static void main(String args []){


        int arr1[]={23,45,23,23};

double average1= Arrays.stream(arr1).average().getAsDouble();//average return optional as double so we used getAsDouble() to get double value.
System.out.print(average1);




    }



}
