public class classA extends Thread{
   public  void run() {//thread has run method which we are implementing
       for (int i = 0; i < 4; i++) {
           System.out.println(Thread.currentThread().getName() + " " + i);

       }


   }
    public static void main(String args[]){

       classA a=new classA();//created new thread
       a.start();//it tells jvm thread2 is ready for execution.

        for(int i=0;i<4;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }




    }










}
