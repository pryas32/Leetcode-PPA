import java.util.Arrays;

import static java.util.Collections.sort;

public class pointname {
  public  int x;
    int y;


    pointname(int x, int y)
    {
        this.x=x;
        this.y=y;
    }



public static void main(String args[]){
        pointname p[]={new pointname(4,3),
        new pointname(3,4)};


  Arrays.sort(p,(p1,p2)->(p1.x- p2.x));


  for(pointname i:p){
      System.out.println(i.x+" "+i.y);
///functosn thats implement comprator interface

    //binart_search//min //max//prioruity_queue//treemap//treeset
    //most widely used functonal interface

//its used when we want ordering apart from naturnl ordering






}




}
