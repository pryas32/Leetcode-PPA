public class static_properties {
    //they are the properties at thh class level
    //they can be accessed through the class name
    //they can be modified in a non-static method
    //they dont have refrence to this keyword as they can be accssed through class name
    //althrough we can access static member through object as well
//we can accss static member in non static method but vice versa not possible
    //static method,members doesnt have access to this keyword

    static  int count=0;
//
    static_properties()
    {
        count++;//access static iin non-static method
    }
/// //

    static int getX(){
        return count;
    }////
//

    public static void main(String args[]){

        static_properties s=new static_properties();
        System.out.println(static_properties.count);
        System.out.println(static_properties.getX());




    }



}
