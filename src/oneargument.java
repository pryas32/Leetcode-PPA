public interface oneargument {

    void test(Integer p);


}

class okgoogle{

    public static void fun(oneargument p,Integer i){
        p.test(i);
    }

public static void main(String args[]){

        fun(x->System.out.println(x),10);


    }

}


