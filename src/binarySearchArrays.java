public class binarySearchArrays implements Comparable<binarySearchArrays> {

    int x;
    int y;

    binarySearchArrays(int x, int y){
        this.x=x;
        this.y=y;
    }


    public int compareTo(binarySearchArrays s){
        return this.x-s.x;
    }


    public static void main(String args[]){


        binarySearchArrays [] arr={

                new binarySearchArrays(2,3),
                new binarySearchArrays(4,5)


        };

        binarySearchArrays p=new binarySearchArrays(4,5);




















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



    }









}
