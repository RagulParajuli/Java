package DynamicMethodDispatch;
class A{
public void show(){
    System.out.println("in show A");
}
}
class B extends A{
public void show(){
    System.out.println("in show B");
}
}

class C extends A{
public void show(){
    System.out.println("in show C");
}
}

public class Main {
    public static void main(String[] args) {
        A obj =new A();  
        obj.show();  //Output: in show A

        obj =new B(); //reference is A (we can use reference of parents) and create object of B  and assign to parents reference variable.
        obj.show();  //Output: in show B

        obj =new C();  //reference is A (we can use reference of parents) and create object of C and assign to parents reference variable.
        obj.show();  //Output: in show C

    }
}