package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int[] x = arr; // x is shallow copy of arr
        x[0] = 100;
        int[] deep = Arrays.copyOf(arr, arr.length);  // deep copy
        deep[0] = 100;
        System.out.println(deep[0]);
        System.out.println(arr[0]);
    }
}
 // array ko func. me pass kr ke naam bhi change kr du to change ni hota knows as shallow copy.
// dusre variables ke naam se original array ki values ko change kr sakte hai.