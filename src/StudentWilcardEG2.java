import java.util.ArrayList;

public class StudentWilcardEG2 {

    public static void print(){
        System.out.println("StudentWilcardEG2");
    }


}

class engStudent extends StudentWilcardEG2{
    public static void print(){
        System.out.println("engstudent");
    }

}

class Test1{

    public static void main(String args []){
        ArrayList<engStudent>eng=new ArrayList<>();
        ArrayList<StudentWilcardEG2>engparent=new ArrayList<>();


//        engparent=eng;//here generics failed assigning child to parent failed theerefore using wilcard.instead of generics





    }



}




