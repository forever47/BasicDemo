package com.winshare.bobblerebound;

public class TestDemo {
	/**
	 * calculateHeight(100,7):����С���100�״�����,��7�η��������ľ���
	 * ����ÿ�η����߶�Ϊ֮ǰ�߶ȵ�һ��
	 * x
	 * x+0.5x
	 * x+0.5x+0.25x
	 * x+0.5x+0.125x
	 * .......
	 * 
	 */
	public static void main(String[] args) {
		Method(100,3);
	}
	public static void Method(double height,int count){
		double countheight=height;//�ܸ߶�
		double currentheight=height;//��ǰ����
		if(count>0){
			if(count==1){
				System.out.println("��һ�η����߶�----��"+height+"��");
				System.out.println("��һ�η��������ľ���----��"+height+"��");
			}else{
				System.out.println("��һ�η����߶�----��"+height+"��");
				System.out.println("��һ�η��������ľ���----��"+height+"��");
				System.out.println("");
				for(int i=2;i<=count;i++){
					currentheight=currentheight/2;
					countheight=countheight+currentheight;
					System.out.println("��"+i+"�η����߶�----��"+currentheight+"��");
					System.out.println("��"+i+"�η��������ľ���----��"+countheight+"��");
					System.out.println("");
				}
		   }
		}
	}
}
