import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Arraysaslits {

public static void main(String args[]){


    Integer arr[]={1,2,3,4};

    List<Integer>l= Arrays.asList(arr);

System.out.println(l);

arr[1]=4;


System.out.println(l);
//its a wrapper over same array class


    //so if we chages arrray or list it will be reflcted

    //applications of arraylist//


    //we dont have any libaray to  reverse an array
//but we can reverse an array using collectiosn
    Collections.reverse(l);
System.out.println(l);   ;




//we can populate hashset using array


    HashSet<Integer>h=new HashSet<>(l);
    System.out.println(h);













}












}
