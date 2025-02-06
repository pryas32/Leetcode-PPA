import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListUsedefinedReverse {
    int x;
    int y;

    ListUsedefinedReverse(int x,int y){
        this.x=x;
        this.y=y;
    }


public static void main(String args[]) {
    List<ListUsedefinedReverse> l = new ArrayList<>();

    l.add(new ListUsedefinedReverse(34, 45));
    l.add(new ListUsedefinedReverse(56, 12));
    l.add(new ListUsedefinedReverse(11, 12));
Collections.sort(l,(p,p1)-> p.x- p1.x);




for(ListUsedefinedReverse i:l)
{
System.out.println(i.x+" "+i.y);
}





}







}
