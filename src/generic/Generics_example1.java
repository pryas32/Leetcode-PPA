public class Generics_example1<T> {
    Object x;//we can declare variable of type oject as object ios root for every non primitive datatype
    Object y;//similarly for y

    public static void main(String agrs[]){
        Generics_example1 p=new Generics_example1();
        p.x="12";
        p.y=23;

        String str=(String)(p.y);//it compiles successfully as we are assigning object(which is root of every noin primitive data type to String
        //But at runtime it will gve error as we are assigning integer to String.
        //getting classcastexception

    }
//




}
