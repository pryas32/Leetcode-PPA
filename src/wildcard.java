 class wildcard {


   public static void print(){
       System.out.println("wildcard");
   }
}

 class student extends wildcard {
     public static void print() {
         System.out.println("student");
     }
 }


     class managementstudent extends wildcard {
         public static void print() {
             System.out.println("managementstudent");
         }


     }
     class TCS{
public static void main(String args[]){
wildcard w=new wildcard();
student s=new student();
w=s;

//we can assign value of student type to parent type.


}




}