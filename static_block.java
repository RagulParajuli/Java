
class mobile
{
    String Brand;
    int price;
    static String name; // static means common(shared by all the objs)

    static{
         name = "Phone";
        System.out.println("In static block");
    }
    public mobile(){
         Brand = "";
         price = 0;
        System.out.println("In constructor");
    }
    void show(){
        System.out.println(" Brand: "+Brand+"\nPrice: "+price+"\nName: "+name+"\n");
    }
}
public class static_block {
    public static void main(String[] args) throws ClassNotFoundException{
         Class.forName("mobile");
        // to load a class without instantiating the object(only works if there is no obj created)

        mobile m1 = new mobile();
        m1.Brand = "Android";
        m1.price = 12000;
        m1.name = "Vivo";
        /* while running program 1st of all class is loaded whioch calls static
        and after object id instantiated */

        mobile m2 = new mobile();
    }
}
