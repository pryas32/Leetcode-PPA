public class Student_Wildcard {

    public static void print(){
        System.out.println("Student_Wilcards");
    }

}


class enggstudent extends Student_Wildcard{

    public static void print(){
        System.out.println("EnggStudent");
    }


}

class Test{

    public static  void main(String args[]){

        Student_Wildcard s=new Student_Wildcard();
        enggstudent s1=new enggstudent();
//we can do like this
        s=s1;


    }



}



