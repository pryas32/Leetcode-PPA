import java.util.ArrayList;

public class WildcardinFunction {

    void print(){
        System.out.println("WildcardinFunction");
    }



}

class enginering extends WildcardinFunction{
    void print(){
        System.out.println("enginering");
    }
}

class management extends WildcardinFunction{
    void print(){
        System.out.println("management");
    }
}

class Tes{

//

    public static void main(String args []){
        ArrayList<enginering>start=new ArrayList<>();
        start.add(new enginering());
        start.add(new enginering());

        ArrayList<management>end=new ArrayList<>();
        end.add(new management());


        printing(start);

        printing(end);


    }
       //what argument passed that is decendant of WildcardFunction
     public static void printing(ArrayList<? extends WildcardinFunction>subchild){

        for(WildcardinFunction i:subchild){
            i.print();
        }
     }


}
