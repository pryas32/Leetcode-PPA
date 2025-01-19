public class arrays {

    public static void main(String args[]){

        //arrays ->used for storing things whcih are in bunch.


        //declaration
        int arr[]={12,13,14};

        // we dont need to pass array size explicitdly

        System.out.println(arr.length);


        //ways of decalring arrays

        int arr1[];//allocated on stack
        arr1=new int [23];

        System.out.println(arr1.length);

//advanatage of array -> we can access its index in O(1)
       // a[i]=address of 0thr index +index*size of element;
//in array the element should of same data type but we can have array object we can array of different data type.

        // we can devide array into type ->array in 1d and array in 2d

        //in 2d we cant decalre array like in C/C++ arr[2][3];XXX

        int array[][]=new int [2][3];

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }



//for jagged array means array in which having different row size

        int arrays[][]=new int[3][];


        for(int i=0;i<arrays.length;i++) {

            arrays[i] = new int[i + 1];

            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]);
            }
            System.out.println();

        }
    }
}
// we can have size constraints in this so we are introducing arraylist or vector where we can shrink or expand size as per our ease.