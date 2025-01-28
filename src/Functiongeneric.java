public class Functiongeneric {


    public static <T>int count(T arr[],T x ){
//if we have used two data type in argument then should declare two data type after static.
int count=0;
for(T i:arr){
    if(i.equals(x)){
        count++;
    }
}

return count;


    }

//generics are useful for non-priitive data type .

    public static void main(String args[]){
        Integer arr[]=new Integer[]{12,23,34,45};
        Integer x=12;


    System.out.println(count(arr,x));

    }



}
