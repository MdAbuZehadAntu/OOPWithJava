
package javabasics;

import java.util.Scanner;

public class S09_ControlStatement_if_else {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        
        if(num>10)
        {
            System.out.println("Greater than 10");
        }
        else if(num==10)
        {
            System.out.println("Equal to 10");
        }
        else
        {
            System.out.println("Less than 10");
        }
   
        char c='p';
        
        if(c>='a' && c<='z')
        {
            System.out.println("ok");
            
        }
        
        
        
    }
    
}
