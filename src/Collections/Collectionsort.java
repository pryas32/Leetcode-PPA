import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collectionsort implements Comparable<Collectionsort> {

    //colcetions are used for sort list collections especially listcollections()
//list collections include arraylist ,linkedlist;
    //Collection implement two interface first is comparable and second is comparator

int x;
int y;

Collectionsort(int x,int y){
    this.x=x;
    this.y=y;
}

    @Override
    public int compareTo(Collectionsort o) {
        return this.x-o.x;
    }

    public static void main(String args[]){
       List<Collectionsort> l=new ArrayList<>();
       l.add(new Collectionsort(4,2));
       l.add(new Collectionsort(1,3));
       l.add(new Collectionsort(2,4));


        Collections.sort(l);


     for(Collectionsort i:l){
         System.out.println(i.x+" "+i.y);
     }











    }










}
