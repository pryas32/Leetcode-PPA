import static java.lang.Long.sum;

public class Exception {

    public static void main(String args[]){


        System.out.println(sum(10,0));

    }


public static int sum(int a,int b){

        return a/b;


        //here 0 passed we need to handle it else system will reach into inconsistent state


   // we cant pass -1 in such case because let if somebody send -10 then also return -1;

    //this is where exception handling ->it is way of handling th exception explicitly so that our system reached into consist state

          //we cant simpl exit from the system

     //we have these choises if exception occurs

    //either to print call stack
      //passing error to the callee
    //printing special messase


    //with the helpo of exception handling if f1 call f2 and f2 calls f3 and f3 calls f4 and in f4 there error occur so f4 will
    //pass error to its calle ie f3 and f3 stop futher execution and pass error to f2 and so on finally main will handle the excption so that system reaches
    //into consistent state


    //advantage of exception handling

            //seperation from the logical code
    //prints calls stack



//eg where we need to handle exception like
// pop from empty call stack or pushing in full call stack
//accesing array index out of bound
    //devide by zero
    //file not found


}




}
