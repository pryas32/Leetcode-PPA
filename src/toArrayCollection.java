import java.util.ArrayList;
import java.util.Collection;

public class toArrayCollection {

    public static void main(String args []){

        Collection<Integer> c=new ArrayList<>();
        c.add(12);
        c.add(23);
        c.add(34);
        c.add(45);


        //collection to array conversion

          Object arr[]=c.toArray();


          for(Object o:arr)
              System.out.println(o);

//java collection framework contains three methods
        //Object [] toArray()   //these are abstraction in this chaging array or object wont make any difference
         //T a[]toArray(T a[])
         //  array to list or collections//when changing from array to list wrapper is created
        //  on same array hence changing array or list would affect in result.
//
//XXXXXXXInteger []arr1=c.toArray();XXXXXXXXXXXX
//        if done like this then wouldnt change to Integer
//
//hence we haev other method to typescase into other data array ie

        Integer []arr1=c.toArray(new Integer[0]);//what type of array we want so we passed using integer[0]


        for(Integer i:arr1)
            System.out.println(i);



    }



}
