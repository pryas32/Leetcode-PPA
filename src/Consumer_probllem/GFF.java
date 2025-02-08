public class GFF {

    boolean signal=false;
    int buffer;



 synchronized  public void prodcue_item(int item) throws InterruptedException {

if(signal==true){
    wait();
}


     buffer=item;

        System.out.println("Producer produces item"+item);
     signal=true;
     notify();
    }



  synchronized public int consume_item() throws InterruptedException {
       if(signal==false)
       {
wait();
       }
        System.out.println("Consumer consumes the item");

       signal=false;
notify();
       return buffer;
    }







}
