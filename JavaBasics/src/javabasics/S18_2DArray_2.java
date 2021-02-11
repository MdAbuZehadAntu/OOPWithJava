
package javabasics;

import java.util.Scanner;


public class S18_2DArray_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][] arr = new int[4][];
        
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=new int[i+1];
        }
        

        
        for(int i=0;i<arr.length;i++)
        {
            int p=i;
            for(int j=0;j<i+1;j++)
            {
                System.out.print(p+++" ");
                
            }
            System.out.println("");
        }
    }
    
}
