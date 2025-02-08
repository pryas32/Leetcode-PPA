import java.util.Scanner;

public class exception_not_being_byMethod {
    public static void main(String agrs []){

try {
    method();
}
catch(ArithmeticException ex){
        System.out.println("ok handled by method itself");

        ex.printStackTrace();
    }
finally {
    System.out.println(" this method will execute whether exception occurs or not");
}
System.out.println("this code will execute 0 only when the exception is catch successfully");
}




    public static void method(){  //if this method throws an exception than
        // either it should handle it or should pass it to th calling exception.then its calling method responsibility to handle the exception

        Scanner sc=new Scanner(System.in);
        int a=12;
        System.out.println("Enter new value of b");
        int b=sc.nextInt();

        try {

            int c = a / b;

        }
//        catch (ArithmeticException ex)//it no catch block then exception will be back to calling block
//        {
//            System.out.println(" exception handled successfully");
//        }
        finally {
            System.out.println("ok exception not being handled");
        }

    }




}

