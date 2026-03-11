package MultiDimensionalArrays;

public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        int[][] arr = {{3,4,2,3,9}, {5,6,4,5,0},{6,7,5,4,6}, {5,9,8,1,3}};
        int[][] brr = {{3,4,2,3}, {5,6,4,5},{6,7,5,4}, {5,9,8,1}};
        brr[1][3] = 20;
        System.out.println(arr[1][3]);
    }
}
