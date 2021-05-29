package com.huida.multitable;

public class MultiTable {
	//计算阶乘
	public static void main(String[] args) {
		printMT(7);
	}
	public static void printMT ( int num ) {
	      if(num>0) {
	    	  for(int j =1;j<=num;j++){
                  for(int k=1;k<=j;k++){            
                       System.out.print(j+"*"+k+"="+k*j);
                       System.out.print(" ");          
                  }
                  System.out.println();            
              }
	      }else{
	    	  System.out.println("必须输入大于零的整数");
	      }
	    }
}
