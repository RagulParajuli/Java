
class AA implements Runnable{
    public void run(){
        for(int i = 0; i< 10 ; i++){
            System.out.println("HI");
            try {
                Thread.sleep(10); // telling a program to wait for _ milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
    // the range of priority goes from 1 to 10
    // where 1 is the least priority and 10 is hightest priority
class BB implements Runnable{
    public void run(){
        for(int i = 0; i< 10 ; i++){
            System.out.println("HELLO");
             try {
                Thread.sleep(10); // telling a program to wait for _ milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Priority_Sleep {
    public static void main(String[] args) {
        Runnable a1 = new AA();
        Runnable b1 = new BB();

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(b1);
        // b1.setPriority(Thread.MAX_PRIORITY);
        //      or
        // b1.setPriority(10);
        // we cannot control our scheduler but be can suggest the scheduler
        // to do the task by using priority
        // System.out.println(a1.getPriority());
        // System.out.println("Priority : "+b1.getPriority());
        t1.start();
         try {
                Thread.sleep(2); // telling a program to wait for _ milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // to get 'hi' and 'hello' in alternate format
            // but not get the output.
        t2.start();
    }
}
