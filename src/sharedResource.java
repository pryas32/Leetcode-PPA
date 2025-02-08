public class sharedResource {

   public void printBracket(char openbracket ,char closingbracket) {
//adding synchronized keyword helps in getting proper result without ambiguity//synchronized block is much faster then synchronizd method
       synchronized (this) {//pass this or object keyword no primitive typoe alowded in lock

           for (int i = 0; i < 10; i++) {
               if (i <= 5)
                   System.out.print(openbracket);
               else {
                   System.out.print(closingbracket);
               }

           }

           System.out.println();

       }
   }

public static void main(String args[]){
        sharedResource s=new sharedResource();

        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++)
                {
                    s.printBracket('{','}');
                }
            }
        });


    Thread t2=new Thread(new Runnable() {
        @Override
        public void run() {
            for(int i=0;i<5;i++)
            {
                s.printBracket('[',']');
            }
        }
    });






    t.start();
t2.start();




}





}
