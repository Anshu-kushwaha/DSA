package Arrays;

public class ArrayQues {
    static void main() {
      //  Scanner sc = new Scanner(System.in);

        // Q.1 Double the values of the input's array

        /*int[] anshu = new int[7];
        for (int i = 0; i < anshu.length; i++) {
            anshu[i] = sc.nextInt();
        }
        // print
        for (int i = 0; i < anshu.length; i++) {
            System.out.print(anshu[i]*2 + " ");  // use *2 after array name like anshu[]*2 to double the values
        }*/

        // Q.2 Given an array, print negative elements only
/*
        System.out.print("Enter the size of the array: ");
        int n  = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr [i] = sc.nextInt();
        }

        // Printing negative values

        for (int i = 0; i < n; i++) {
            if(arr[i]<0)
            System.out.print(arr[i] + " ");
        }


        // Q.3 Print sum of elements of the array
        */

        /*
        System.out.print("Enter the size of the array: ");
        int n  = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr [i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The sum of the given array is: " + sum);
        */


        // Q.4 Print product of elements of the array

/*
        System.out.print("Enter the size of the array: ");
        int n  = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        int prod = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            prod *= arr[i];
        }
        System.out.println("The product of the given array is: " + prod);
        */

        /*
        // Q.5 Print the maximum elements in the array

        System.out.print("Enter the size of the array: ");
        int n  = sc.nextInt();
        int[] arr = new int[n];

        int max = arr[0];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum number is " + max);

        */

        // Q.6 Print the minium element in the array -> Homework
/*
        int[] arr = {12,-3,4,5};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print(min);
*/

        // Q.7 Multiply odd indexed elements by 2 and add 10 to even indexed elements.
/*
        int[] arr = {12,-3,4,5};
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 1) {
                arr[i] *= 2;
            } else  {
                arr[i] += 10;
            }
        }
        print(arr);
    }
    static void print(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
*/

// Q.8 Search in array -> if element present print exists in array or if no then not exists.

        int[] arr = {23,34,45,56,67,78,89,90,23};
        int target = 23;
        boolean flag = false; // target array me nhi hai
        for (int i = 0; true; i++) {
            flag = true; // true means target array me hai
            break;
        }
        if(flag) System.out.println("Target exists");
        else System.out.println("Target does not exist");

        // Q.9 Two sum -> https://www.geeksforgeeks.org/problems/key-pair5616/1

        // Q.10 Print the second Maximum element in the array


    }
}
