import java.util.Arrays;

public class arraysaslist {

    int x;
    int y;

    arraysaslist(int x,int y){
        this.x=x;
        this.y=y;
    }


    @Override
    public String toString() {
        return x+" "+y;
    }

    public static void main(String args[])
{
arraysaslist l[]={
        new arraysaslist(1,23),new arraysaslist(11,232),
        new arraysaslist(123,2343)
};


System.out.println(Arrays.toString(l));
//Arrays.toString()->gives string representation of the array
 //its both for primitive and  non primitiev type



    int arr[]={1,2,3,4,5};

    System.out.println(Arrays.toString(arr));

Integer arra[]={1,2,3,4};

System.out.println(Arrays.toString(arra));

//for character array println() is defined in some other way
    char charu[]={'a','y','s'};

    System.out.println(charu);//here it will not print hashcode it will print content











}











}
