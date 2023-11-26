
class mobile
{
    String Brand;
    int price;
    static String name; // static means common(shared by all the objs)

    void show(){
        System.out.println(" Brand: "+Brand+"\nPrice: "+price+"\nName: "+name+"\n");
    }
}
public class static_var {
    public static void main(String[] args) {
        mobile m1 = new mobile();
        m1.Brand = "Android";
        m1.price = 12000;
        m1.name = "Vivo";

        mobile m2 = new mobile();
        m2.Brand = "Apple";
        m2.price = 120000;
        m2.name = "Apple";

        mobile.name = "Phone"; // name of both obj will become 'Phone'
        m1.show();
        m2.show();
    }
}
