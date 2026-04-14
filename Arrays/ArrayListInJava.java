package Arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJava {
    static void main() {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(12);
        arr.add(48);
        arr.add(07);
        arr.add(17);
        arr.add(19);

        System.out.println(arr.get(4));   // access element

        // changing values in arrayList
        arr.set(1,40);
        System.out.println(arr);

        /*
        // delete index
        arr.remove(1);
        System.out.println(arr);  // not traversing the array by ourselves
        /*
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+ " ");
        }
        for (int ele : arr){
            System.out.print(ele + " ");
        }
         */

        // type arr. to view all options

        arr.add(23);  // add element in last
        System.out.print(arr);

        arr.add(1, 100);  // add element in choosen index
        System.out.print(arr);

        // reverse all elements

        Collections collection = null;
        collection.reverse(arr);
        System.out.println(arr);
    }
}
