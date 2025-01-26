import java.util.Scanner;

public class runtime_exception {

    public static void main(String args[]){

        try{
            Scanner sc=new Scanner(System.in);

            int a=10;
            int b=sc.nextInt();
            int c=a/b;
        }
        catch (ArithmeticException ex){  //if there wasnt any catch block the  last System.out.println() woullnt have printed

System.out.println("Arithematic exception occured");
//

        }
        finally {
            System.out.println("this block run whether exception is handled or not ");
        }

        System.out.println(" this runs only when exception is handled ");









    }






}
