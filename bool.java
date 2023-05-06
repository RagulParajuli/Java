public class bool {
    public static void main(String[] args) {
        System.out.println("For logical AND\n");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if(a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        System.out.println("For logical OR\n");
        boolean d = true;
        boolean e = false;
        boolean f = true;
        if(d || e || f){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

     
        System.out.println("For logical NOT\n");
        System.out.println("Not(a) is "+ !a);
        System.out.println("Not(b) is "+ !b);
        System.out.println("Not(c) is "+ !c);
        System.out.println("Not(d) is "+ !d);
        System.out.println("Not(e) is "+ !e);
        System.out.println("Not(f) is "+ !f);
        
    }
}
