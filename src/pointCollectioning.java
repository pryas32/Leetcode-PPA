import java.util.Arrays;

public class pointCollectioning {
    int x;
    int y;


    pointCollectioning(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static void main(String args[]) {
        pointCollectioning p[] = {new pointCollectioning(4, 2),
                new pointCollectioning(1, 3),
                new pointCollectioning(0, 1)
        };


        Arrays.sort(p,(p1,p2)->(p1.x-p2.x));// we passed directly lambda expression we need not to implemtn that comparator explicitly.


        for(int i=0;i<p.length;i++)
        {
            System.out.println(p[i].x+" "+p[i].y);
        }





    }


}