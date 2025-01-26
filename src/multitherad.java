class multitherad implements  Runnable {


        public void run(){
            System.out.println("runnable interface");
        }

        public static void main(String args[]){
            Thread t=new Thread(new multitherad()); //we pass object of test class as an argument to thread class a new thread got created
            t.start();//then this new thread starts running.//earlier only one thread was running that was main thread.
//
            System.out.println("test thread");

        }
//
    }


//java cant extend thread from some other class as it doesnt allow multiple inheritance
//hence if it want to extend thread from some other calss then it need to implement runnable interface.



