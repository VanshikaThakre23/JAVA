//Count element in sorted array and remove duplicates 
public class july7CountDuplicate {
    public static int removeDuplicates(int nums[]){
        if(nums.length == 0){
            return 1;
        }

        int count = 1;
        int pointer = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[pointer]){
                count++;
                pointer++;
                nums[pointer] = nums[i];
            }
        }
        return count;
    }
    public static void main(String[] args){
        int nums[] = {1,1,2,3,4,4,4,5,6};
         System.out.println("Before removing duplicates");
        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Count of unique elements = " +removeDuplicates(nums));

        int newnums = removeDuplicates(nums);
        System.out.println("After removing duplicates");
        for(int i =0;i<newnums;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
