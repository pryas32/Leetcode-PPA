public class Producer extends Thread {
    GFF gfg;


    Producer(GFF gfg) {
        this.gfg = gfg;
    }


    public void run() {
        int i = 1;


        while (true) {
            try {
                gfg.prodcue_item(i);

                i++;

                Thread.sleep(1000);
            } catch (Exception ex) {

            }
        }
    }
}




