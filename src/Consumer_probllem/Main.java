import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        GFF gfg = new GFF();

        Producer pr = new Producer(gfg);

        Consumer cr = new Consumer(gfg);


        pr.start();
        cr.start();
    }




}

    //we have application of Arrays.asList().//we need to discuss on  it.