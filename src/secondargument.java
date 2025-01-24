public interface secondargument {

    void test(Integer p,Integer p1);


}



class okdoodgle{

public static void  fun(secondargument p,Integer p1,Integer p2){//(x,x1)->System.out.println(x+" "+x1) will replace secondargument p
    p.test(p1,p2);
}


public static void main(String args[]){

    fun((x,x1)->System.out.println(x+" "+x1),10,23);  //here x and x1 will take data type defined in abstract method
}

}
