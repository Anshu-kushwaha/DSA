package Arrays;

public class ForEach {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
//        for (int element : arr){
//            System.out.print(element + " ");
//
//            // -> in for each loop you can't double the array
//        }
        for( int i = 0; i < arr.length; i++){
            arr[i] *= 2;
        }
//        for (int element : arr){
//            ele *= 2 ;
//        }
        for (int element : arr){
            System.out.print(element + " ");
        }
    }
}
