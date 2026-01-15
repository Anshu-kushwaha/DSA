package Arrays;

public class PassingArrayToMethod {
    static void main() {

        /*
        int x = 10;
        change(x);
        System.out.println(x);
    }

    static void change(int x) {
        x = 20;

        // -> value of x is not gonna change in variable

         */

        int x[] = {78, 65, 69, 54, 70};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    static void change (int[] y) {
        y[2] = 99;

        // here element changes in array
    }
}
