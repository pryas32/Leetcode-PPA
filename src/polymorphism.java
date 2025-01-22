public class polymorphism {
    //there are two types of polymorphism ->compile time polymorphism (method overloading)
    //runtime polymorphism->method overriding
    //polymorphism->poly means many morphism mean form
    // means classs with many forms


float sum(int a ,float b){
    return a+b;
}

    int sum(int a ,int b,int c){
        return a+b+c;
    }



    int sum(int a ,char b){
        return a+b;
    }
    long sum(int a ,long b){
        return a+b;
    }




public static void main(String agrs[]){




    polymorphism p=new polymorphism();
   System.out.println(p.sum(12,23));

//
//method overloading ->same method name but different parameter
    //if passed data type which is not matching then type conversion happen int->long etc

}




}
