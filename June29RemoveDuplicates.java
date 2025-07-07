
public class June29RemoveDuplicates{

public static int removeDuplicates(int nums[]){
    int j = 0;
    for(int i=0;i<nums.length;i++){
        if(nums[j] != nums[i]){
            nums[++j] = nums[i];
        }
    }
    return j+1;
}
public static void main(String[] args) {
 int nums[] = {0,1,1,1,2,2,3,4,6,6,6,6,7,7,7,7,8,8,8,8};
  System.out.println("Before removing duplicates the array is = ");
 for(int i=0;i<nums.length;i++){
    System.out.print(nums[i] + " ");
 }
 System.out.println();
 
 int length = removeDuplicates(nums);

 System.out.println("After removing duplicates the array is = ");
 for(int i=0;i<length;i++){
    System.out.print(nums[i] + " ");
 }
}
}
    
