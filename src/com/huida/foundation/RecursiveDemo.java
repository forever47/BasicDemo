package com.huida.foundation;

public class RecursiveDemo {
		
		public static void main(String[] args) {		
				System.out.println(sum(100));
		}
		/**
		 * @param �ݹ���ͷ���
		 */
		public static int sum(int num){
			if(num == 1){
				return 1;
			}
			return num + sum(num-1);
			
		}
}
