import java.util.Arrays;
import java.util.Comparator;

public class binarySearchArrays {

    int x;
    int y;

    binarySearchArrays(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public static void main(String args[]){
        binarySearchArrays[] arr = {

                new binarySearchArrays(2, 3),
                new binarySearchArrays(4, 5)


        };

        binarySearchArrays p = new binarySearchArrays(4, 5);


        System.out.println(Arrays.binarySearch(arr, p,(p1,p2)->p1.x-p2.x));








}



}


class mycmp implements Comparator<binarySearchArrays> {
    @Override
    public int compare(binarySearchArrays o1, binarySearchArrays o2) {
        return o1.x - o2.x;
    }


    public static void main(String args[]) {


        binarySearchArrays[] arr = {

                new binarySearchArrays(2, 3),
                new binarySearchArrays(4, 5)


        };

        binarySearchArrays p = new binarySearchArrays(4, 5);


        System.out.println(Arrays.binarySearch(arr, p, new mycmp()));//kaise compare karna han that we have

        System.out.println(Arrays.binarySearch(arr, p, new mycmp()));/
    }


}








//        int arr[]={2,3,4,5,6};
//
//        System.out.println(Arrays.binarySearch(arr,4));
//
//        System.out.println(Arrays.binarySearch(arr,3,4,5));
//
//
//        Integer aray[]={2,3,4,5,6};
//
//        System.out.println(Arrays.binarySearch(aray,4));
//
//        System.out.println(Arrays.binarySearch(aray,3,4,5));
//
//




