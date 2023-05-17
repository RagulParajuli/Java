import java.util.Scanner;
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class rectangle{
    int length;
    int breath;
    public int area(int l, int b){
        return l * b;
    }
    public int perimeter(int l, int b){
        return 2 * (l + b);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
class circle{
    float radius;
    float height;
    final float PI = 3.14f;
    public float area(float r){
        return PI * r *r;
    }
    public float perimeter(float r, float h){
        return 2 * PI * r * h;
    }
}

public class oops_basic {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        // Problem 1
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        // Problem 2
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        //asus.ring();

         // Problem 3
         Square sq = new Square();
         System.out.println("Enter your size:");
         sq.side = sr.nextInt();
         System.out.println(sq.area());
         System.out.println(sq.perimeter());

        // Problem 4
        rectangle re = new rectangle();
        System.out.println("Enter length and breath:");
        int l = re.length = sr.nextInt();
        int b = re.breath = sr.nextInt();
        System.out.println(l+b);
        System.out.println(l+b);


           // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

         // Problem 6
         circle cr = new circle();
         System.out.println("Enter radius and height:");
         float ri = cr.radius = sr.nextFloat();
         float hi = cr.height = sr.nextFloat();
         System.out.println(ri);
         System.out.println(ri+hi);
    }
}
