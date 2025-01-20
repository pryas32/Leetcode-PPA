public class classes {

    private int a,b;

    classes(){
        a=0;
        b=0;
    }//constructor ->same name as that of class
    //no return type act as default constructor

    public int getX(){
        return a;//through functions we can access private varibles;
    }

    public int getY(){//although no need of getter setter here as we are accessiing things within same class
        return b;
    }


    //through getter ,setter we can set or get the values



    //oops ->object oriented programming
    //its a way to write a code
    //earlier we were having procedural programming language where we were having one class and inside that class we were having one fuction caliiing other finction

    //eg

//    class test{
//        public static void main(String args[]){
//            add();
//
//
//        }
//
//        public staic void add()
//        {
//            add2();// and so on
//        }
//
//
//
//        public static void add2(){
//
//            //and so on
//        }


    //But main problem arises when we were in need of two entities calling each
    // other like students want to communicate with teacher there oops came into picture

    //classes->it consist of data member and functions /properties of an entity
    //entities ->consist of method and properties of class
//    advantage of oops->inhertiance-> we need  ot to write code multiple time only wht we need to do is to inherit properties of parent class

public static void main(String args[]){

    classes c=new classes();
//    c.a=23;
//    c.b=24;

    System.out.println(c.a);
    System.out.println(c.b);


    }

}
