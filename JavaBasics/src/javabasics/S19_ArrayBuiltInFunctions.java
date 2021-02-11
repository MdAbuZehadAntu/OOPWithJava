
package javabasics;

import java.util.Arrays;


public class S19_ArrayBuiltInFunctions {
    
    public static void main(String[] args) {
       int [] arr={5,2,3,4,1,6,7,8};
        int [] p=Arrays.copyOf(arr, 3);
        
        for(int i=0;i<p.length;i++)
        {
            System.out.println(p[i]);
        }
        int [] q=Arrays.copyOfRange(arr,1, 4);
        
        for(int i=0;i<q.length;i++)
        {
            System.out.print(q[i]+ " ");
        }
        
       Arrays.sort(arr);
        System.out.println("");
       
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
       
  
       
        
    }
    
}
