class Counter{
    int count;
    public synchronized void increment(){ // synchronized helps to procress one thread at a time
        count++;
    }
}

public class Join {
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter();

        Runnable a1 = () ->{        // Lambda function
                for(int i=0; i<1000; i++){
                    c1.increment();
                }
        };
        Runnable b1 = () ->{        // Lambda function
                for(int i=0; i<1000; i++){
                    c1.increment();
                }
        };

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(b1);

        t1.start();
        t2.start();

        t1.join();  // joining(adding) thread 1 in main method after all calculation.
        t2.join();  // joining(adding) thread 2 in main method after all calculation.

        System.out.println(c1.count); // showing the result after joining both t1 and t2 in main method
        // scheduler are unpredictable which doesn't give same or exact answer
    }
}
