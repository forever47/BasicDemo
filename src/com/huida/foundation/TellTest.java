package com.huida.foundation;

public class TellTest {

	public static void main(String[] args) {
		int arr[]={7,9,1,3,0,5};
		int arr2[]={2,3,1,3,0,5,0,2,1,4,0};
		String phone="";
		for(int i:arr2){
			phone+=arr[i];
		}
		System.out.println("µç»°£º"+phone);
	}
}
