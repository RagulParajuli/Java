
class Human{
    private int age;
    private String name;

    public void setName(String n){
        name = n;
    }
   
    public String getName(){
        return name;
    }

     public void setAge(int a){
       age = a;
    }
    public int getAge(){
        return age;
    }
}
public class encap {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Ragul");
        h1.setAge(19);

        System.out.println(h1.getName()+" : "+h1.getAge()+" from "+h1.getClass());
        
    }
}
