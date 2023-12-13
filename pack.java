import tools.AdvCal;// import packageName.className
import tools.Calc; // import packageName.className

public class pack {
    public static void main(String[] args) {
        Calc c1 = new Calc();
    AdvCal ac1 = new AdvCal();
        
        System.out.println(c1.add(4, 2));
        System.out.println(c1.sub(5, 1));

        System.out.println(ac1.multi(2, 4));
        System.out.println(ac1.div(10, 2));
    }
}
