 class method_overriding_child extends method_overriding{


static   void print(){
       System.out.println("method_overriding_child");
    }
///////
public static void main(String args[]){
    method_overriding m=new method_overriding_child();
    m.print();  //in method overriding base class refering to the class one is called
    //at runtime if method is not present to the class to which its pointing out then parent class method is called.
//
//Note static method cant be overridden in java
    //eg as given above .

    // as static property belong to class not to method .
    //static keyword should be present in both the class ie child and parent.

}

}
