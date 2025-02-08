import java.util.Scanner;

public class exception_stacktrace {

    public static void main(String agrs []){


        method();

System.out.println("ok handled by method itself");

    }


public static void method(){  //if this method throws an exception than
        // either it should handle it or should pass it to th calling exception.

        Scanner sc=new Scanner(System.in);
        int a=12;
        System.out.println("Enter new value of b");
        int b=sc.nextInt();

        try {

            int c = a / b;

        }
        catch (ArithmeticException ex)
        {
            System.out.println(" exception handled successfully");
        }

}




}
