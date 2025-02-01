import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class linkedhapshing {

public static void main(String args []){

    //linkedhashmap->maintains order of insertion
    //implemented using doubly linked list
    LinkedHashMap<String,Integer>p=new LinkedHashMap<>(10);//define initial capactity
    p.put("Richa",10);
    p.put("Gupta",12);
    p.put("Prayas",13);

System.out.println(p);
p.remove("Richa");

System.out.println(p);

//if we want to access these object acc to access level that is acc to our read level
    //our read result should come at the last for that
    LinkedHashMap<String,Integer>p1=new LinkedHashMap<>(3,0.6f,true);//where 3 is initial capacity 0.6f is after 60% of full capacity resize the array size to its doub;le true means return value acc to access level
    //if kept as false then would have return  value acc to insertion level.
p1.put("Prayas",12);
p1.put("Gupta",23);
    p1.put("Richa",14);
    p1.put("aakash",15);

p1.get("Gupta");

System.out.println(p1);















}










}
