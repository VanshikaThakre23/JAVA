public class spiralMatrix {
    public static void printSpiral(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol){
            //top
            for(int j = 0;j<=endcol;j++){
                System.out.println(matrix[startrow][j] + " ");
              }
            //right
            for(int i = startrow+1;i<=endrow;i++){
                System.out.println(matrix[i][endcol] + " ");
              }
             //bottom
            for(int j = endcol-1;j>=startcol;j--){
                System.out.println(matrix[endrow][j] + " ");
                if(startrow == endrow){
                    break;
                }
              }
               //left
            for(int i = endrow-1;i>=startrow;i--){
                System.out.println(matrix[i][endcol] + " ");
              }
              if(startcol == endcol){
                    break;
                }

                startrow++;
                startcol++;
                endrow--;
                endcol--;
        }
    }
 public static void main(String args[]) {
    int matrix[][] = {{1,2,3,4,5},
                     {6,7,8,9,10},
                     {11,12,13,14,15},
                     {16,17,18,19,20} };
printSpiral(matrix);
 } 

}
