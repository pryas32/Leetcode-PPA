 class super_keyword_child extends super_keywrd{

void fun(){
    System.out.println("child class is being called");
    super.fun();// we can use super keyword to call parent class method.
}
//

public static void main(String args []){
super_keywrd s=new super_keyword_child();//base class known as parent class refering to child class
s.fun();
}


}
