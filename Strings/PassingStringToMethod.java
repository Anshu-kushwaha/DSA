package Strings;

public class PassingStringToMethod {
    public static void change(String x) {
         x = "Utkarsh";
    }

    public static void main(String[] args) {
        String x = "Anshu";
        System.out.println(x);
        //change(x);
        x = "Mohit";
        System.out.println(x);
    }
}
