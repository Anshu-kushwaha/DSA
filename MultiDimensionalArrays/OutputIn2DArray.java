package MultiDimensionalArrays;

import java.util.Scanner;

public class OutputIn2DArray {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
//    int[][] arr = new int[3][4];
//        //int[][] arr = {{2,3,4,5}, {3,6,5,4}, {2,4,5,4}, {1,9,8,4}};
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }
                // sum of 2D array
        int[][] arr = {{2,3,4,5}, {3,6,5,4}, {2,4,5,4}, {1,9,8,4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                sum += arr[i][j];
            }
            System.out.print(sum + " ");
        }
    }
}