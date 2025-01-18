import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class input {

    public static void main(String args[]) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//System.in->used to read byte
//InputStreamReader->it convert stream of bytes inot stream of character
       //BufferedReader->to read character from stream of character .

         String s=br.readLine();//three types there read for reading a character //read a line of character
        //readline()->for reading a line

int x=parseInt(s);
System.out.println(x);
    }
//    there are mainly two ways of taking input in java
//            1.BufferReader
//            2.Scanner class




}
