package com.winshare.bobblerebound;

public class TestDemo {
	/**
	 * calculateHeight(100,7):计算小球从100米处掉下,第7次反弹经过的距离
	 * 假设每次反弹高度为之前高度的一半
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
		double countheight=height;//总高度
		double currentheight=height;//当前距离
		if(count>0){
			if(count==1){
				System.out.println("第一次反弹高度----："+height+"米");
				System.out.println("第一次反弹经过的距离----："+height+"米");
			}else{
				System.out.println("第一次反弹高度----："+height+"米");
				System.out.println("第一次反弹经过的距离----："+height+"米");
				System.out.println("");
				for(int i=2;i<=count;i++){
					currentheight=currentheight/2;
					countheight=countheight+currentheight;
					System.out.println("第"+i+"次反弹高度----："+currentheight+"米");
					System.out.println("第"+i+"次反弹经过的距离----："+countheight+"米");
					System.out.println("");
				}
		   }
		}
	}
}
