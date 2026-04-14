package Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {12, 3, 27, 53, 18, 62, 88, 6, 55};
        int target = -1;
        int found = -789;   // -789 means target array me nahi hai

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = i;   // index mil gaya
                break;
            }
        }

        if (found != -789) {
            System.out.println("Target exists in array at index " + found);
        } else {
            System.out.println("Target missing in array");
        }
    }
}
