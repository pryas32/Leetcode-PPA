import java.util.Arrays;

public class ArrayCollection {

    public static void main(String args[]){


        //Arrrays ->they are static fumnction which can be called by using class name and not by creating instance
        //thye are utility functions and are for primitive and non primitive arrays and not for collections


        //not fill and compare method doesnt implement compoarator interface
        int i=-1;

        int arr[]=new int [3];

        Arrays.fill(arr,i);

      System.out.println( Arrays.toString(arr));//give String version of an array


        Arrays.fill(arr,1,3,0);//note last index not included.


       System.out.println( Arrays.toString(arr));


        Integer arr1[]=new Integer[4];

        Arrays.fill(arr1,i);

System.out.println(Arrays.toString(arr1));

//        they are initilally fiilled with default 0 value.
//            there are two version of fill() in arrays
                //while in collection we haev only one version
        //ie Collections.fill(arr,i);
        //there is no concept of subarray in Collections


//we have tow version for binary_search

        int arr2[]={1,2,3,5};





       System.out.println( Arrays.binarySearch(arr2,4));//if not found then return -(insertion+1)

//second version

        //filing multidimensional array

        int arra[][]= new int[2][2];

        for(int row[]:arra){
            Arrays.fill(row,1);
        }

System.out.println(Arrays.toString(arra));


        int mon[]={1,4,34,255};//suarray
        System.out.println( Arrays.binarySearch(arr2,1,3,5));






    }




}
