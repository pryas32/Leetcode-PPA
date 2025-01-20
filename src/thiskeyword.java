class thiskeyword {

    //it refers to the current object for which the code is to be executed.
    //it helps in chaining of the functions
    //used to call appropriate functiosn
    //eg


    int a;
    int b;


    thiskeyword(int a,int b){
        this.a=a;
        this.b=b;
    }


    thiskeyword(){
        this(10,10);
    }

    //help in chaining of functions
//
//    thiskeyword setA(int a){
//        this.a=a;
//        return this.a; //// This returns an `int`, but the return type is `thiskeyword` so creates pblm
//
//    }


    thiskeyword setA(int a){
        this.a=a;
        return this; //// same return type as mentioned thiskeyword

    }



      thiskeyword setB(int b){
        this.b=b;
        return this;
    }





}

class test{

    public static void main(String args[]){
        thiskeyword a=new thiskeyword();
        System.out.println(a.a);
        System.out.println(a.b);
a.setA(45).setB(23);//to enable method chaining setter function should return something else will give error.

        System.out.println(a.b);
    }




}
