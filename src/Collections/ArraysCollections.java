import java.util.Arrays;
import java.util.Collections;

public class ArraysCollections {

    //Arrays.sort () is used for both primitive and non primitive data type .
    // we cant use custom comparator for primitive type for  sorting list in reverse order
    //for non primitive data type we can use custom comparator for sorting them in decreasing order.
//for list collection class like arraylist ,linkedlist we can sort them using Collections.sort()
    //and can use custom comarator for them.
    public static void main(String args[]){

                int arr[]={1,2,3,4};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//Sorting non primitive type in reverseOrder
        //for non primitive we have Collections.reverseOrder();


        Integer arr1[]={1,2,34,4,5};

Arrays.sort(arr1, Collections.reverseOrder());


System.out.println(Arrays.toString(arr1));






            }










        }





