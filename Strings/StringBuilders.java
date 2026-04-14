package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Anshu");
        System.out.println(s.length()+" "+ s.capacity());  // initial capacity is 16
        System.out.println(s);

        // functions

        s.append(" Raj");  // pichhe se add krna
        System.out.println(s);

        s.setCharAt(1, 'r');
        System.out.println(s);

        //check all functions there are so many
    }
}
