import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PointComparator {

    //this doesnt implemnt comparable interface hence we need to implement compareTo(p x,p y)
//of comparator

int x;
int y;


PointComparator(int x, int y){
    this.x=x;
    this.y=y;
}

public static void main(String args[]){
    List<PointComparator>l=new ArrayList<>();
    l.add(new PointComparator(4,3));
    l.add(new PointComparator(2,1));
    l.add(new PointComparator(1,5));

    Collections.sort(l,(p1,p2)->p1.x-p2.x);

    for(PointComparator i:l){
        System.out.println(i.x+" "+i.y);
    }



}


}
