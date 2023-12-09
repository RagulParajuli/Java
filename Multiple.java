
class A extends Thread{
    public void run(){
        for(int i = 0; i< 10 ; i++){
            System.out.println("HI");
        }
    }
}
    // Thread are used to execute the code in parallel not in sequence
    // Every Thread contains start() and run() method
class B extends Thread{
    public void run(){
        for(int i = 0; i< 10 ; i++){
            System.out.println("HELLO");
        }
    }
}
class Multiple{
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        a1.start();
        b1.start();
    }

}