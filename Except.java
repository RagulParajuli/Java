class Except{
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try{
            j = 8/i;
        }
        catch(Exception e){
            System.out.println("Somthing went worng...");
        }
        System.out.println(j);
        System.out.println("Rest of the code");
    } 
}