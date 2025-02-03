import java.util.Arrays;

public class pointCollections implements Comparable<pointCollections>{


    int x;
    int y;

    pointCollections(int x, int y){
    this.x=x;
    this.y=y;
    }




   public int compareTo(pointCollections p)
   {
      if(this.x!=p.x){
          return this.x-p.x;
      }
      else{
          return this.y-p.y;
      }
   }


public static void main(String args[]){
       pointCollections arr[]={new pointCollections(4,2),
               new pointCollections(1,4),
               new pointCollections(1,1)

       };


    Arrays.sort(arr);//it internally calls compareTo() method sort method calls


    //Array.toString() // we can call for ;list representation not for two pointer.


  for(int i=0;i< arr.length;i++)
  {
      System.out.println(arr[i].x+""+arr[i].y);
  }


}










}
