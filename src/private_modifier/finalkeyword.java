package private_modifier;

public class finalkeyword{

//public final class finalkeyword {


    //when ever we decalre anything as final its value cant be chaged or modified
    //eg
   // final static int a=10;
//    cant do
//    a=23;
    //final static int a;//blank final varibale
  //  a=0; //here its wrong as it need to be declared when initialized

//    final   int a;  //at instance level how we ddecalre final keyword
//    {
//        a=100;
//    }

    static final  int a=0; //final jeyword can be decalred insdide the constructor or method

//    finalkeyword(){
//        a=0;
//    }


//    static {  //declaring final static method
//        a=100;
//    }


    final void print(){
        System.out.println("hello ");
    }


public static void main(String args[]) {
//these properties can be access through class name

    //at local level final keyword decalration

    // final int a=100;//at local level final keyword decalration
   // finalkeyword f=new finalkeyword();
    System.out.println(a);



   // we cant extend final keyword in java
    //whether its final class
    //final method or final member cant be changed



    //ways of decalring final static varible






}

}


