import java.util.Map;
import java.util.TreeMap;

public class TreeMapping {

    public static void main(String args[]){


        TreeMap<Integer,String>p=new TreeMap<>();//we can use functions like floor ,ceiling ,lower ,higher,and can use O(Logn)
        p.put(12,"aakash");
        p.put(234,"kiet");
        p.put(45,"oops");
        p.put(67,"prayas");

   System.out.println(p.floorKey(45));//get value lower or equal to that value
        System.out.println(p.floorKey(65));
        System.out.println(p.floorKey(40));
        System.out.println(p.ceilingKey(65));
        System.out.println(p.lowerKey(230));
        System.out.println(p.higherKey(40));

System.out.println("__________________________________________________");

System.out.println("___________________________________________________");

for(Map.Entry<Integer, String> e:p.entrySet()){
    {
        System.out.println(e.getKey()+""+e.getValue());
    }

}


System.out.println(p.floorEntry(65).getValue());










    }
















}
