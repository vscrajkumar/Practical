package com.practice.programming;

public class TwoSum {
	
	private TwoSum(){
		
	}
	
	TwoSum(float val){
		
	}
    public static int[] findTwoSum(int[] list, int sum) {
        
        for(int index=0;index<list.length;index++){ 			//-- n+1 times
            
        	for(int index1=0;index1<list.length;index1++){		//-- n * n+1 
        		
        		if((list[index]+list[index1])==sum){			//-- n*n		2n 
        			return (new int[]{index,index1});						
        		}
        	}
        }
        return (new int[]{});
        
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}