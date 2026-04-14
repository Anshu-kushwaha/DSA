package Strings;

public class ReverseString {
    public static String reverse(String str) {
        if (str == null || str.length() <= 1) return str;

        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}