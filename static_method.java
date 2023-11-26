
class mobile{
    String Brand;
    int price;
    static String name;

    void show(){
        System.out.println(" Brand: "+Brand+"\nPrice: "+price+"\nName: "+name+"\n");
    }
    static void show1(mobile obj){
        System.out.println("In static method");
        System.out.println("Brand: "+obj.Brand+"\nPrice: "+obj.price+"\nName: "+obj.name+"\n");
        // cannot use non-static var in static method
    }
}
public class static_method {
    public static void main(String[] args) {
        mobile m1 = new mobile();
        m1.Brand = "Android";
        m1.price = 12000;
        m1.name = "Vivo";

        mobile m2 = new mobile();
        m2.Brand = "Apple";
        m2.price = 120000;
        m2.name = "Apple";

       mobile.name = "Phone"; //Cannot make a static reference to the non-static field mobile
        m1.show();
        m2.show();

        mobile.show1(m1); // we cannot access mobile.show(), for object m1
        mobile.show1(m2); // for object m2
    }
}
