import java.util.Scanner;

public class UserDefinedException extends Exception {

public  UserDefinedException(String message){
    super(message);//user defined exception should inherit from checked exception or from Exception class
    //not from runtime exception as compiler doesnt force it in runtime exception to throw exception
}

}


 class ABC{


    public static void main(String args[]) {



        try {
            Scanner sc = new Scanner(System.in);
            String ar = sc.nextLine();//here two exception are shown
            //one if user enters abc then jumberformat exception
            int balance = Integer.parseInt(ar); //if user enters -ve value then userdefinedexception
            updateBalance(balance);
        }
        catch (NumberFormatException ex){
            System.out.println("numberformat exception occured");
        } catch (UserDefinedException e) {
            System.out.println("User Defined exception thrown ");
            e.printStackTrace();

        }
catch (Exception ex){
            System.out.println("Parent class");
}
        finally {
            System.out.println("This will execute reagrdless whether exception caught or not");
        }

//
    }


    public static void updateBalance(int balance) throws  UserDefinedException{
        if(balance<0)
        {
            throw new UserDefinedException("UserDeinedexception Occured");
        }
    }




}








