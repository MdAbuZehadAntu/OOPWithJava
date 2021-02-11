
package javabasics;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class S21_SortingArrayList {
    
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<5;i++)
        {
            num.add(input.nextInt());
        }
        System.out.println(num);
        
        System.out.println("Ascending Order : ");
        Collections.sort(num);
        System.out.println(num);
        System.out.println("Descending Order : ");
        Collections.sort(num,Collections.reverseOrder());
        System.out.println(num);
    }
    
}
