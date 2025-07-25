public class MergeSortedArr{

    public static void MergeArray(int nums1[],int nums2[] ,int m ,int n){
            int i = m-1;
            int j = n-1;
            int k = m + n -1;

            while(i>=0 && j>=0){
                if(nums1[i] > nums2[j]){
                    nums1[k] = nums1[i];
                    k-- ; i--;
                }
                else{
                    nums1[k] = nums2[j];
                    k--;j--;
                }
                
            }
            while(j>=0){
                    nums1[k] = nums2[j];
                    k--;j--;
                }
                
    }

    public static void main(String[] args){
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {3,4,5};
        int m = 3 ,n =3;

        MergeArray(nums1,nums2,m,n);

        //print answer MergeArray
        for(int num : nums1){
            System.out.print(num + " ");
        }
    }
}