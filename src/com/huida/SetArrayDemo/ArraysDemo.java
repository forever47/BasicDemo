package com.huida.SetArrayDemo;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int [] arr={11,2018,28,1984,2,19};
		//����
		Arrays.sort(arr);
		//���
		  for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
	}
}
