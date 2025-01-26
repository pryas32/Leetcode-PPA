import java.util.Scanner;

public class exception_throw_throws {


    public static void main(String args []){


  try {
      method();
  }
  catch (ArithmeticException ex){
      ex.printStackTrace();
  }
finally {
      System.out.println("used throws and throw ");
  }
System.out.print("this one will execute if exception handled");



    }
public static void method() throws ArithmeticException{
        //throws may throw one or more exception.it tell function tht it might throw an exception.
//throws tell to calling function to handle exception .
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=12;

if(a==0){
    throw new ArithmeticException();//this exception andf throws one should match each other.
}

}


}
