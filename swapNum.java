public class swapNum {
    public static void main(String [] args){

    //with third variable 
      
        int a = 10 , b=20;
        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("number after swapping ");
        System.out.println(a + " "+ b);

        //without third variable
        a = a + b;
        b = a - b;
        a =  a - b; 
        
        System.out.println("number after swapping ");
        System.out.println(a + " "+ b);

    }
}
