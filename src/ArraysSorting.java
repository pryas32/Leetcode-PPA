import java.util.Arrays;
import java.util.Collections;

public class ArraysSorting {


    //method which are common in both arrays adn collections are sort,fill,binary_search.

    // we use stable sorting algorithm for non primituv e data type like mergse sort
    //and for primitive we use dual pivot sort


       // we can sort primitive array only in increasing order or we can take one extra temp variale
public static void main(String args[]) {


    int arr[] = {1, 24, 12, 11};


//    Arrays.sort(arr);
//
//
//    System.out.println(Arrays.toString(arr));

    Arrays.sort(arr,1,2);// we can sort subarray from gioven array


    System.out.println(Arrays.toString(arr));





    //for non primitive type we can do

    Integer arr1[]={4,1,2,3};


    Arrays.sort(arr1, Collections.reverseOrder());

    // we can reverse non primitve in reverseorder using custom comparator

   System.out.println(Arrays.toString(arr1));
















}
















}
