public class staticgeneric <T>{

public static int x=0;
//we can use class for more than one data type.

    staticgeneric(){
x++;
    }

public static void main(String args[]){
        staticgeneric<String> s=new staticgeneric<>();
        staticgeneric<Integer>s1=new staticgeneric<>();

        System.out.println(staticgeneric.x);
}


}
