import java.util.Scanner;

public class Multiplexception {


    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        try{
            method();
         int c=12/n;

            System.out.println("this block will execute or not");
        }
        catch (ArithmeticException ex)
        {
            System.out.println("arithemetic exception occured");
            ex.printStackTrace();
        }
        catch (NullPointerException ex)
        {
            System.out.println("Null Pointer Exception occured");
            ex.printStackTrace();
        }
       catch (Exception ex){
            System.out.println("Parent exception if it doesnt matches with any exception ,should be kept at the last,its parent of all the exceptions");
        }
finally{
            System.out.println("executes even if caught exception or not ");
        }
System.out.println("this run if exception is caught");


    }

public static void method()throws NullPointerException{

        Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
        try{
            if(a==0)
            {
                throw new NullPointerException();
            }
        }
        finally {
            System.out.println("didnt caught using catch very chalak bro ");
        }

//jvm searches for the correct exception type backward.



}

}
