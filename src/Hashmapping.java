import java.util.HashMap;
import java.util.Map;

public class Hashmapping {

    public static void main(String args []){

        HashMap<String,Integer>p=new HashMap<>();
        p.put("aakash",1);
        p.put("prayas",2);
        p.put("aakashian",3);
         System.out.println(p.size());
        System.out.println(p.get("aakas"));
        System.out.println(p.remove("ok"));
           p.replace("aakash",12);



           System.out.println(p);

           System.out.println(p.containsKey("pryas"));
        System.out.println(p.containsValue(23));


       System.out.println(p.keySet());//return collection set//give set of keys as view if we make any changes in resultant key then it will be reflected here as well
       System.out.println(p.values());//return values set
        System.out.println(p.getOrDefault("akansha",0));//if key was present then it would have return the value associated with it else it has return default value ie 0.


System.out.println("____________________________________________________");
        for(Map.Entry<String,Integer>e:p.entrySet())//p.entrySet()->it contains key -value pair what type of datat structure it is Map.Entry<String,Integer> e just similiar to For(Integer i:map)
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }




///
///time complexity ->O(1) as it internally imolement hashing.













    }







}
