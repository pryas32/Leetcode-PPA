public class GFF {

    boolean signal=false;
    int buffer;



 synchronized  public void prodcue_item(int item) throws InterruptedException {

if(signal==true){//intercommunication between both the threads
    wait();
}


     buffer=item;

        System.out.println("Producer produces item"+item);
     signal=true;
     notify(); //then notifying thread 2 . ir consumer thread
    }



  synchronized public int consume_item() throws InterruptedException {
       if(signal==false)
       {
wait();
       }
        System.out.println("Consumer consumes the item");

       signal=false;
notify();//notifying thread1ie producer thread
       return buffer;
    }







}
