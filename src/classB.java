public class classB implements  Runnable{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }



    public static void main(String args[]){
        //here we neeed to pass classb in the constructor of therad class why ? as it doesnt extends therad class
        //thread has private static target member it assigns value to it and then runns target.run();
        classB b=new classB();
        Thread t=new Thread(b);



        t.start();//it add t in thread object array



        for(int i=0;i<4;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }



    }




}
