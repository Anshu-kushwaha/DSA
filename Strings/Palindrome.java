package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter String: ");
            String s = sc.nextLine();
            String rev = new StringBuilder(s).reverse().toString();
            System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
        }
    }
}

/*

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter String: ");
            String s = sc.nextLine().trim().toLowerCase().replaceAll("\\s+", "");

            if (s.equals("exit")) break;

            String rev = new StringBuilder(s).reverse().toString();
            System.out.println(s.equals(rev) ? "Palindrome " : "Not Palindrome");
        }

        sc.close();
    }
}
*/

/*

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter String: ");
            String s = sc.nextLine();
            String rev = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                rev = rev + s.charAt(i);
            }

            if (s.equals(rev)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }

            System.out.println();
        }
    }
}

*/


/*
                    GFG
class Solution {
    boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

*/
