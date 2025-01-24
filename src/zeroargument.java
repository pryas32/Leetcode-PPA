public interface zeroargument {

void test();


}



class zeroargumentexample{

    //why decalred fun as static if not decalred then would have to create object of this class

   // The main method is the entry point of a Java application and is always static. Because main is static, it can only directly invoke other static methods or access static fields within the same class.

    //If fun were not declared static, you would need to create an instance of the


   public static void fun(zeroargument t) {
       t.test();
   }

public static void main(String args[]){


       fun(()->System.out.println("hello world"));

}



}