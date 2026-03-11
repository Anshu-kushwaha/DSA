package MultiDimensionalArrays;

public class RowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{5, 6, 3, 1, 4}, {7, 5, 4, 6, 8}, {7, 5, 3, 1, 1}};
        int maxSum = Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if (sum > maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println(row+ " "+maxSum);
    }
}