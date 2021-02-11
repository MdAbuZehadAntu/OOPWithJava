
package javabasics;

import java.util.Scanner;


public class S07_UserInput {
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num;
        System.out.print("Enter an integer  :");
        num=input.nextInt();
        System.out.println("You have entered : "+num);
        input.nextLine();
        
        String str; 
        System.out.print("Enter a string   :");
        str=input.nextLine();
        System.out.println("You have entered : "+str);
        
        boolean bool = input.nextBoolean();
        System.out.println(bool);
        char c = input.next().charAt(0);
        System.out.println(c);
        
//        for double input.nextDouble()
//        for float input.nextFloat()
        
        
        
    }
    
}
