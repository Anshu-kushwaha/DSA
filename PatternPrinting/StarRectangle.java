package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                // RECTANGLE

        /*int row = scanner.nextInt();
        int col = scanner.nextInt();
        for (int i = 1; i<=row; i++){  // kitni lines hogi
            for (int j = 0; j<=col; j++) {  // har line me kitna print hoga
                System.out.print("JIMYA \uD83D\uDE01 ");
            }
            System.out.println();
        }*/


                // SQUARE

       /* int n = scanner.nextInt();
        for (int i = 1; i<=n; i++){  // kitni lines hogi
            for (int j = 1; j<=n; j++) {  // har line me kitna print hoga
                System.out.print("JIMYA \uD83D\uDE01 ");
            }
            System.out.println();
        }*/

           /*   1 2 3 4
                1 2 3 4     -> Number square
                1 2 3 4
                1 2 3 4
          */

       /* int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

                // Alphabet Square

        int n = scanner.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <=n ; j++) {
                System.out.print((char)(j+65) +" ");   // replace (j+65) to (j+97) to print value in small letters -> ASCII Capital letters ke liye base = A(65) | Small letters ke liye base = a(97)
            }
            System.out.println();
        }
    }
}
