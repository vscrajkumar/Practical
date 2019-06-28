package com.practice.programming;

public class Solution {

	public int Solution1(int n){
	
		int[] d=new int[30];
		int l=0;
		int p;
		while(n>0){
			d[l]=n%2;
			n/=2;
			l++;
		}
		for(p=1;p<1+l;++p){
			for(p=1;p<l;++p){
				int i;
				boolean ok=true;
				for(i=0;i<l-p;i++){
					if(d[i]!=d[i+p]){
						ok=false;
						break;
					}
				}
				if(ok){
					if(ok && p<=l/2){
						return p;
					}
				}
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int num=955;
		Solution obj=new Solution();
		System.out.println("955---"+obj.Solution1(num));

	}
}

