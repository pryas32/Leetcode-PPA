class child_abstraction  extends abstraction{

   child_abstraction(int a){
       super(a);
   }


    @Override
    void area() {// implemented abstract method of abstraction
       System.out.println(a*a);
    }
}




