package com.huida.foundation;
/**
 * ð�������Ż���
 * ����ĳһ������֮���Ѿ�����������Ҫ�������������
 * @author Thinkpad T450
 *
 */
public class SortBubble {
	public static void main(String[] args) {
		int [] arr={11,2018,28,1984,2,19};
		SortBubble sb=new SortBubble();
		//����
		sb.bubbleSort(arr);
		//���
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
