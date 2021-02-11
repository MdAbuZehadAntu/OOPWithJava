
package javabasics;

import java.util.Scanner;

public class S15_Array {
    public static void main(String[] args) {
        int arr[]=new int[5];// array declaration and creation
        int [] arr1={1,2,3,4};
        Scanner input=new Scanner(System.in);
        
        for(int i=0;i<3;i++)
        {
            arr[i]=input.nextInt();
        }
        
        System.out.println("Size of the array : "+arr.length);
        
        for(int i=0;i<4;i++)
        {
            System.out.println(arr1[i]);
        }
        
    }
    
}
