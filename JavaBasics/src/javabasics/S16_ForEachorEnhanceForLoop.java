
package javabasics;

import java.util.Scanner;


public class S16_ForEachorEnhanceForLoop {
    public static void main(String[] args) {
       int [] arr = new int[5];
       int sum=0;
       Scanner input = new Scanner(System.in);
        
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=input.nextInt();
       }
       for(int x:arr)
       {
           sum+=x;
       }
        System.out.println(sum);
    }
    
}
