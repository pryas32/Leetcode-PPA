 class GenericFunction {

    public static <T,S> int count(T [] arr,S x)
    {  //we define data type in argument before return type in generic function.
        int count=0;
        for(T t:arr){
            if(t.equals(x)){
                count++;
            }
        }
        //
//
        return count;
    }
    public static void main(String args[]){

        Integer arr[]={12,34,23};
        Integer x=23;

        System.out.println(count(arr,x));

    }




}
