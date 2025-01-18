public class fun {

int x;
int y;


}
applications of fumctions -> act as a stack when one fucntion is called until umless that is not being complted the other will not be called.
//it follows fucnction call stack.
advantage of functions->reduces  code redundancy.
 class abc{
    public static void main(String args []){

        fun f=new fun();
        f.x=10;
        func(f);

        System.out.print(f.x+" "+f.y);
    }

public static void func(fun f){
      f=new fun();

}

}