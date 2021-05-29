package com.huida.foundation;
/**
 * 冒泡排序优化：
 * 假如某一趟排序之后已经有序，我们需要减少排序的趟数
 * @author Thinkpad T450
 *
 */
public class SortBubble {
	public static void main(String[] args) {
		int [] arr={11,2018,28,1984,2,19};
		SortBubble sb=new SortBubble();
		//排序
		sb.bubbleSort(arr);
		//输出
//		  for(int i=0;i<arr.length;i++){
//              System.out.print(arr[i]+"  ");
//          }
		for(int i:arr){
			System.out.println(i);
		}
	}
	public void bubbleSort(int[] arr) {
		   boolean exchange;
		   for(int i=0; i < arr.length - 1;  i++) {
		       exchange = false;
		       for(int j = 0; j <arr.length - 1- i; j++) {
		           if(arr[j] > arr[j+1]) {
		        	   int temp = arr[j];
	                    arr[j]=arr[j+1];
	                    arr[j+1]=temp;
		               exchange = true;
		           }
		       }
		       if(!exchange) return;
		   }
		}
}
