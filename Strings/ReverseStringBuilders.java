package Strings;

public class ReverseStringBuilders {
    public static void main(String[] args) {

        /*
        String s = "Anshu Raj";
        StringBuilder sb = new StringBuilder(s);
        //sb.reverse();
/*
        //Another way for reverse an Array
        int i = 0, j = sb.length()-1;
        while(i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j, temp1);
            i++;
            j--;

        }*/

        /*
        sb.deleteCharAt(4);
        System.out.println(sb);
        sb.delete(3,4);
        System.out.println(sb);
        */

        // reverse
        String s = "Komal";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);
    }
}
