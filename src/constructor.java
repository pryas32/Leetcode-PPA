class constructor {
    int a;
    int b;


    constructor(){
        this.a=0;
        this.b=0;
    }

/// /

    constructor(int a, int b) {
        this.a = 0;
        this.b = 0;
    }


}

class abc{

    public static void main(String args[]){
        constructor c=new constructor();// if we our decalring any other constructor that its our responsibility to create default constructor if its in need
        System.out.println(c.a);
    }



}
