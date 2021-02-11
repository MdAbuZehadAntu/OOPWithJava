
package javabasics;

import java.util.ArrayList;
import java.util.Scanner;

public class S20_ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<5;i++)
        {
            num.add(input.nextInt());
        }
        System.out.println(num);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(9);
        c.add(76);
        c.add(888);
        System.out.println(c);
        
        
        num.add(0,25);
        System.out.println(num);
        num.addAll(2,c);
        System.out.println(num);
        num.remove(0);
        System.out.println(num);
        c.clear();
        System.out.println(c);
        ArrayList<Integer> d=(ArrayList<Integer>) num.clone();
        System.out.println(d);
        System.out.println(d.get(3));
        System.out.println(d.size());
        d.set(3,69);
        System.out.println(d);
        System.out.println(d.contains(95));
        
        
    }
    
}
