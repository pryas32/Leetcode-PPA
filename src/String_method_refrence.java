import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_method_refrence {


    public static void main(String args []){

    String s[]={"OK","google","Prayas"};
    String str[]={"ok ","Google","prayas"};

//comparetoIgnoreCase is static method heance used class name
if(Arrays.equals(s,str,String::compareToIgnoreCase))
        {
System.out.println("they are equal");
        }
else{
    System.out.println("No they arent");
}



}
}
