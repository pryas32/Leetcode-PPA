import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class method_refrence {

    //lambda expression used for implementing abstract method of functional interface

    //method refrence used when we to pass same argument to other functions

    //eg (p)->System.out.println(p)
    //can be replaced by System.out::println   ;
    //out here is for object .

    //eg

    public static void main(String args []){

    List<Integer> l=new ArrayList<>(Arrays.asList(12,34,45,45));

   l.forEach(System.out::println);//used for object-> out

//or lambda expression was like p->System.out.println(p);
//
//or through class name for static method to be used
//
//                like l.forEach(GFG::square); where GFG is class name and square is static method


}}
