import java.util.Scanner;

class Circle{
    private float radius;
    private final float PI = 3.14f;
    private float height;
        public void setradius(float ri){
        if(ri>= 0){
            radius = ri;
        }
        else{
            System.out.println("Wrong Type");
        }      
    }

     public void setheight(float ht){
        if(ht>= 0){
            height = ht;
        }
        else{
            System.out.println("Wrong Type");
        }      
    }
     public float getradius(){
        return radius;
    }
        public float getheight(){
            return height;
    }
        public float area(float r){
               float ar = PI*r*r;
                return ar;
    }
        public float perimeter(float ri, float ht){
           float per =  2*PI*ri*ht;
           return per;
    }
}

public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle cr = new Circle();
        System.out.println("Enter your radius and height:");
        cr.setradius(44.4f);
        System.out.println(cr.getradius());
        cr.setheight(4.4f);
        System.out.println(cr.getheight());
        
        // Incomplete program

    }
}
