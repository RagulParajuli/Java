public class encrypt_decrypt {
    public static void main(String[] args) {
       // Encryption
        char grade= 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decryption
        grade=(char)(grade - 8);
        System.out.println(grade); 
    }
}
