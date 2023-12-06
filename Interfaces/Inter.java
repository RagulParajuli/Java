// package Interfaces;
interface Computer{
    String name = "Ragul"; //final and static

    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run: Faster");
    }
}
class Developer{
    void devApp(Computer lap){
        // System.out.println("coding..");
        lap.code();
    }
}
public class Inter{
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer des = new Desktop();
        Developer name1 = new Developer();
        System.out.println(Computer.name);
        name1.devApp(lap);
        name1.devApp(des);
    }
}