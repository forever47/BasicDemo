package com.huida.foundation;
public class Test31 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test31.printTable();
	//	Test31.printSum(4, 7);
//		int [] arr={'a', 23 , 45 , 6};
		//int arr[]={1,4,7,9};
//		Test31.printArray(arr);
		boolean b=true;
		if(b=false)         
		{
		   System.out.println("a");
		}
		else if(b)
		{
		   System.out.println("b");   
		}
		else if(!b)
		{
		   System.out.println("c");
		}
		else
		{
		   System.out.println("d");
		}
		/**
		 * 案例中虽然木有进入第一个循环体内，但首先是把b的值赋为false了
		 */
	}
	//打印乘法表
	public static void printTable(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
	//求和
	public  static void printSum(int a,int b){
		System.out.println("a+b="+(a+b));
	}
	//遍历数组
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
