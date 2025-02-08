
public class Consumer extends Thread{
    GFF gfg;

    Consumer(GFF gfg)
    {
        this.gfg=gfg;

    }


    public void run()
    {

        while(true)
        {

            try {
                int item = gfg.consume_item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try{

                Thread.sleep(1000);
            }catch (Exception ex){};

        }


    }

















}
