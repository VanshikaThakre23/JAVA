public class july7PrintSubArr{

public static void printSubarray(int nums[]){
    for(int i =0;i<nums.length;i++){
        int start = i;
        for(int j=i;j<nums.length-1;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(nums[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
   

}
public static void main(String[] args) {
    int nums[] = {1,2,3,4,5,6,7};
    printSubarray(nums);
}
}
