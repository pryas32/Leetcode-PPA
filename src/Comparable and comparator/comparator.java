import java.util.Arrays;

public class comparator {
    int a;
    int b;
    comparator(int a,int b){
        this.a=a;
        this.b=b;
    }
}


class okll{
    public static void main(String args[]){

        comparator arr[]={new comparator(40,23),
                new comparator(12,45),
                new comparator(5,10)};

        Arrays.sort(arr,(p1,p2)->(p1.a-p2.a));//sort acc to x co-ordinates


        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i].a+" "+arr[i].b);
        }


    }

//we have interface comparator<T>
//{
//  public  int comparator(T p1,T p2);
//}


}