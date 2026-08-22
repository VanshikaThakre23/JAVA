public class pallindroeOrNot {
    public static void main(String[] args) {
        
        String str = "madam";

        String rev  = "";

        for(int i = str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
        if(rev == str){
            System.out.println("Pallindrome");
        }else System.out.println("Not Pallindrome");
    }
}
