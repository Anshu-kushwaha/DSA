package MultiDimensionalArrays;

public class SnakePrint {
    public static void main(String[] args) {
        int[][] arr = {{5, 6, 3, 1, 4}, {7, 5, 4, 6, 8}, {7, 5, 3, 1, 1}};
        for (int i = 0; i< arr.length;i++){
            if (i%2 == 0){
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j]+ " ");
                }
            }
            else {
                for (int j = arr[0].length-1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}











