package com.huida.foundation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayDemo {
/**
 * �����뼯��
 * @param args
 */
	public static void main(String[] args) {
		//����ת����
		int[] arr = {1,3,4,6,6};
		Arrays.asList(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]);
		}
		System.out.println();
		//����ת����
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b"); 
		list.toArray();
		System.out.println(list.toString()+list.get(0));
		System.out.println();
		//�ַ�����ת
		String str="�Ϻ�";
		StringBuilder sb = new StringBuilder(str);	                  
		String str2= sb.reverse().toString();
		System.out.println(str2);
	}

}
