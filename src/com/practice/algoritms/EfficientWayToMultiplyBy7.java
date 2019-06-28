
//Time Complexity: O(1)

package com.practice.algoritms;

public class EfficientWayToMultiplyBy7 {
	static int multiplyBySeven(int n) 
    {  
        /* Note the inner bracket here.  
        This is needed because precedence 
        of '-' operator is higher  
        than '<<' */
		System.out.println("n--"+n);
		System.out.println("(n & 1)--"+(n & 1));
		System.out.println("(n & 2)--"+(n & 2));
		System.out.println("(n >> 1)--"+(n >> 1));
		System.out.println("(n >> 2)--"+(n >> 2));
		System.out.println("(n >> 3)--"+(n >> 3));
		System.out.println("(n >> 4)--"+(n >> 4));
		System.out.println("(n << 1)--"+(n << 1));
		System.out.println("(n << 2)--"+(n << 2));
		System.out.println("(n << 3)--"+(n << 3));
		System.out.println("(n << 4)--"+(n << 4));

        return ((n << 3) - n); 
    } 
      
    // Driver code 
    public static void main (String arg[])  
    { 
        int n = 4; 
          
        System.out.println(multiplyBySeven(n)); 
    } 
}
