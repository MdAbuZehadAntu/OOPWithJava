
package javabasics;

import java.util.Scanner;

public class S17_2DArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int row=2;
        int col=3;
        int [][] arr = new int[row][col];
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=input.nextInt();
            }
        }
        
        for(int[] x:arr)
        {
           for(int d:x)
           {
               System.out.println(d);
           }
        }
    }
    
}
