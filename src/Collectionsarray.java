import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionsarray {

public static void main(String arsg[]){




    //collectiosn has metohd which for wwork for only non primituve data type there is no option for primitive data type in collections


    //those who implement collcetion interface

    //method like fill ,binarysearch(comparator ,comprable )//abtsratc mwthod like compareTo,compare
    //max,min,reverse,collections.frequency(list,3);

    List<Integer>l=new ArrayList<>();
    l.add(12);
    l.add(23);
    l.add(34);
    l.add(45);

//here object passing in binary search,list should be decendant of it .
    System.out.println(Collections.binarySearch(l,12));

//fill function


  //  Collections.fill(l,3);

    System.out.println(l);

Collections.reverse(l);

System.out.println(l);
System.out.println(Collections.max(l));
    System.out.println(Collections.min(l));

    System.out.println(Collections.frequency(l,45));

    //frequency doesnt work for user defined type as in this it inherit equals method from object class




}





}
