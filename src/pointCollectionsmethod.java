import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pointCollectionsmethod implements Comparable<pointCollectionsmethod> {


    int x;
    int y;


    pointCollectionsmethod(int x, int y){
        this.x=x;
        this.y=y;
    }



    public int compareTo(pointCollectionsmethod p){
       return  this.x-p.x;
    }


public static void main(String args []){

        pointCollectionsmethod[] arr= {new pointCollectionsmethod(1, 2),
                new pointCollectionsmethod(2, 3),
    new pointCollectionsmethod(3, 4)
                    };


    List<pointCollectionsmethod>l= Arrays.asList(arr);//collcetions method work for list not for arrays.


    pointCollectionsmethod p1=Collections.max(l);


    System.out.println(p1.x+" "+p1.y);



}
















}
