package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // output

//        int[] arr = {5,-9,65,45,87,6};
//        int n = arr.length; // index -> 0 to n-1
//        //System.out.println(arr.length);  // know the length of array
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

                // INPUT
        int[] anshu = new int[7];
        for (int i = 0; i < anshu.length; i++) {
            anshu[i] = sc.nextInt();
        }
        // print
        for (int i = 0; i < anshu.length; i++) {
            System.out.print(anshu[i] + " ");  // use *2 after array name like anshu[]*2 to double the values
        }
    }
}
