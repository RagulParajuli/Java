
class MyEmployee{
   private int id;
   private String name;
   public void setname(String n){
        name  = n;
   }
   public String getname(){
     return name;
   }
public void setid(int i){
    id = i;
   }
   public int getid(){
    return id;
   }
}
    public class access_modifer {
        public static void main(String[] args) {
            MyEmployee e1 = new MyEmployee();
            // e1.id = 32;
            // e1.name = "Ragul"; --> throws error due to private access modifer
            // adding private to attributes of a class hide details and cannot be modified or accessed directly
            e1.setname("Ragul");
            System.out.println(e1.getname());
            e1.setid(45);
            System.out.println(e1.getid());
        }      
     }