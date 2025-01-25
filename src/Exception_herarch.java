import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_herarch {


    there are mainly five keyword



    try {
        //code that can throw an exception put it inot this block
    }
    catch (Type t1){
        //handle that exception

    }
    catch(Type t2){

        //hadle that exdeption
        // t1,t2 .... should be subclass of exception class
    }



    finally {
        //used for common code

        //like suppose some common code we wrote in catch(Type t1 ) similarly sone in catch(Type t2) these we can write common code in
        //finally block
    }



    thorws-> this we use when we dont know how to handle th exception ,so whenever any function calls it it has to handle it or pass it to his caller

    vod fun() throws FileNotFoundException{  //so this code might throw an error so whatever function calls it ,it has to hadle it explicitly or pass it to its upper function.
        Scanner sc=new Scanner("file.text");
    }




    throw ->used for throwing an exception like if someone enters age lesss than 18 throw exception .

userdefined exception-> these are the subclass of exception class.




}
