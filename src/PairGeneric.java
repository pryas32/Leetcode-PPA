public class PairGeneric<T,V> {
    Object x;
    Object y;

public static void main(String args[]){
PairGeneric<Integer,String> p=new PairGeneric<>();
p.x=12;
p.y="prayas";
  String str= (String)p.x;//here it compiles fine and give error at runtime but we prefer error at the compile time hence use generic
//p.x is Object and we are assigning  to a String
    //at runtime we got to know its actually of type int.

}

}
