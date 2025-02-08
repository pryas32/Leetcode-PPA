import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class checked_exception {

    //cehcked_exception ->they are checked at the compile time .Compiler force us to write some extra code in order to handle them.
    //eg

    public static void main(String args []) {
        try {

            Scanner in = new Scanner(new File("txt.in"));
            //checked exception file not found exception

            System.out.println("program exit");
        } catch (FileNotFoundException ex) {

            // for eveery try there is a catch block but vice versa isnt true
            System.out.println("file not found ");
        }

        finally {
            System.out.println("this block works whether tru is handled or not ");
        }
        System.out.println(" this doesn't run in case of uncaught exception");


    }
}
