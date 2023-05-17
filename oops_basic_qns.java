import java.util.Scanner;

class Employee{
    int salary;
    String name;
        public int getsalary(){
            return salary;
        } 
        public String getname(){
            return name;
        }
        public void setName(String n){
            name = n;
        }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4 * side;
    }
}

class rectangle{
    int length;
    int breath;
    public int area(int ln, int bt){
       return ln * bt;
     
    }
    public int perimeter(){
        return 2 * (length + breath);
    }
}

class tommy{
    public void hit(){
        System.out.println("Hitting");
    }
    public void run(){
        System.out.println("Running");
    }
    public void fire(){
        System.out.println("Firing");
    }
}

class circle{
    final float PI = 3.14f;
    float radius;
    float height;
    public float area(Float r){
        return PI * (r*r);
    } 
    public float perimeter(float r, float h){
        return 2 * PI * r * h;
    }
}
public class oops_basic_qns {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        // Problem-01
        Employee e1 = new Employee();
        e1.setName("Ragul"); 
        System.out.println(e1.getname()); 
        e1.salary = 32;
        System.out.println(e1.getsalary());

        // Problem-02
        CellPhone asus = new CellPhone();
        asus.ring();
        asus.vibrate();
        
        // Problem-03
        square sq = new square();
        System.out.println("Enter your size");
        sq.side = sr.nextInt();
        System.out.println("Your area is: "+sq.area());
        System.out.println("Your perimeter is: "+sq.perimeter());

        // Problem-04
        rectangle re = new rectangle();
        System.out.println("Enter your length and breath");
        int l = re.length = sr.nextInt();
        int b = re.breath = sr.nextInt();
        System.out.println("Your area is: "+re.area(l,b));
        System.out.println("Your perimeter is: "+re.perimeter());
        
        // Problem-05
        tommy t = new tommy();
        t.hit();
        t.run();
        t.fire();
        
        // Problem-06
        circle cr = new circle();
        System.out.println("Enter your radius and height");
        float r = cr.radius = sr.nextFloat();
        float h = cr.height= sr.nextFloat();
        System.out.println("Your area is: "+cr.area(r));
        System.out.println("Your perimeter is: "+cr.perimeter(r,h));

    }
}
