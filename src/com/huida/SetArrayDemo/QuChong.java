package com.huida.SetArrayDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/**
 * ȥ��
 * �����ж��Ƿ����ظ�Ԫ��
 *  isRepeat:ʹ������
 *  isRepeat2:ʹ�ü���
 *  ����ȥ��
 *  ifRepeat:����ѭ����������ԭ���飬��������ж��Ƿ��֮���Ԫ���ظ���Ȼ��������������µ�����
 *  ifRepeat2:ʹ�ü���list��contains����������false��add,add֮����toArray����
 *  ifRepeat3:����Set�������򲻿��ظ������Խ���Ԫ�ع���,add֮����toArray����
 *  ifRepeat4:����Ĺ�ϣ���ϣ���˳�򣬲��ظ�
 * @author WYN
 *
 */
public class QuChong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] obj={1,4,7,9,9,7,4,1};
		//�ж��Ƿ����ظ�
		//System.out.println(isRepeated(obj));
		Integer[] obj={1,7,4,9,9,7,4,1};
//		Object[] obj2=ifRepeat(obj);
//		for(Object x : obj2){
//			System.out.println(x);
//		}
//		Object[] obj3=ifRepeat2(obj);
//		for(Object x : obj3){
//			System.out.println(x);
//		}
//		Object[] obj3=ifRepeat3(obj);
//		for(Object x : obj3){
//			System.out.println(x);
//		}
		Object[] obj3=ifRepeat4(obj);
		for(Object x : obj3){
			System.out.println(x);
		}
	}
	//�ж������е�Ԫ�������ظ�
	 static boolean isRepeated(int[] obj){
		 boolean flag=false;
		 for(int i=0;i<obj.length;i++){
			 for(int j=0;j<obj.length;j++){
				 if(obj[i]==obj[j]){
					 flag=true;
					 break;
				 }
			 }
		 }
		return flag;
	}
	 static boolean isRepeated2(int[] obj){
		 boolean flag=false;
		Set<Integer> list=new HashSet<Integer>();
		for(int i=0;i<obj.length;i++){
			if(!list.add(obj[i])){
				flag=true;
				break;
			}
		}
		return flag;
	}
	 //ȥ��
	 static Object[]  ifRepeat(Object[] obj){
		 //������¼ȥ���ظ�֮������鳤�Ⱥ͸���ʱ������Ϊ�±�����  
	        int t = 0;  
	        //��ʱ����  
	        Object[] obj2=new Object[obj.length];
	        //����ԭ����  
	        for(int i = 0; i < obj.length; i++){  
	            //����һ����ǣ���ÿ������  
	            boolean isTrue = true;  
	            //�ڲ�ѭ����ԭ�����Ԫ������Ա�  
	            for(int j=i+1;j<obj.length;j++){  
	                //����������ظ�Ԫ�أ��ı���״̬�����������ڲ�ѭ��  
	                if(obj[i]==obj[j]){  
	                    isTrue = false;  
	                    break;  
	                }  
	            }  
	            //�жϱ���Ƿ񱻸ı䣬���û���ı����û���ظ�Ԫ��  
	            if(isTrue){  
	                //û��Ԫ�ؾͽ�ԭ�����Ԫ�ظ�����ʱ����  
	               obj2[t] = obj[i];  
	                //�ߵ�����֤����ǰԪ��û���ظ�����ô��¼����  
	                t++;  
	            }  
	        }  
	        //������Ҫ���ص����飬�������ȥ�غ������  
	        Object[]  newobj = new Object[t];  
	        //��objaycopy�������ղ�ȥ�ص����鿽���������鲢����  
	        System.arraycopy(obj2,0,newobj,0,t);  
	        return newobj;  	 
	 }
	 @SuppressWarnings("unchecked")
	static Object[] ifRepeat2(Object[] obj){
		@SuppressWarnings("rawtypes")
		List list=new ArrayList();
		 for(int i=0;i<obj.length;i++){
			 if(!list.contains(obj[i])){
				 list.add(obj[i]);
			 }
		 }
		 return list.toArray();
	 }
	 @SuppressWarnings("unchecked")
	static Object[] ifRepeat3(Object[] obj){
		@SuppressWarnings("rawtypes")
		Set list=new HashSet();
		 for(int i=0;i<obj.length;i++){
			list.add(obj[i]);
		 }
		 return list.toArray();
	 }
	 static Object[] ifRepeat4(Object[] obj){
		 Set<Object> list = new LinkedHashSet<Object>();  
	        for (int i = 0; i < obj.length; i++) {  
	            list.add(obj[i]);  
	        }  
			return list.toArray();  
	 }
//	 static Set<Object> ifRepeat5(Object[] obj){
//		 Set<Object> list = new LinkedHashSet<Object>();  
//	        for (int i = 0; i < obj.length; i++) {  
//	            list.add(obj[i]);  
//	        }  
//			return list;  
//	 }
}
