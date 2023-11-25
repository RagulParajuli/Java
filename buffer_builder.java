public class buffer_builder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ragul");
        // StringBuffer are mutable and are not actual string
        System.out.println(sb.capacity());
        // capacity and length are not same 
        System.out.println(sb.length()); 
        sb.append(" Parajuli");
        System.out.println(sb);
        String str = sb.toString();
        // there are different functions in sb 
        System.out.println(str);
        sb.deleteCharAt(2);
        sb.insert(0, "Java ");
        System.out.println(sb);

        // stringBuffer are thread safe but stringBuilder are not

    }
}
