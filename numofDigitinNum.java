public class numofDigitinNum {
    public static void main(String[] args) {
        int num = 1000;


        int count = 0 ;

        while(num != 0){
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
