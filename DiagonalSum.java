public class DiagonalSum{

    public static int printDiagonalSum(int matrix[][]){
        int sum = 0;

        for(int i=0;i<=matrix.length-1;i++){
            sum += matrix[i][i];
            sum += matrix[i][matrix.length-i-1];
        }
        if(matrix.length % 2 != 0){
            sum -= matrix[(matrix.length)/2][(matrix.length)/2];
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,1,2,3}};
       int result = printDiagonalSum(matrix);
       System.out.println(result);

    }
}