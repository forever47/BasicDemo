package com.huida.SetArrayDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/**
 * 去重
 * 方法判断是否有重复元素
 *  isRepeat:使用数组
 *  isRepeat2:使用集合
 *  方法去重
 *  ifRepeat:两层循环，外层遍历原数组，内容逐个判断是否和之后的元素重复，然后再提出来存入新的数组
 *  ifRepeat2:使用集合list的contains方法，返回false则add,add之后再toArray返回
 *  ifRepeat3:利用Set集合无序不可重复的特性进行元素过滤,add之后再toArray返回
 *  ifRepeat4:链表的哈希集合：有顺序，不重复
 * @author WYN
 *
 */
public class QuChong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] obj={1,4,7,9,9,7,4,1};
		//判断是否有重复
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
	//判断数组中的元素有无重复
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
	 //去重
	 static Object[]  ifRepeat(Object[] obj){
		 //用来记录去除重复之后的数组长度和给临时数组作为下标索引  
	        int t = 0;  
	        //临时数组  
	        Object[] obj2=new Object[obj.length];
	        //遍历原数组  
	        for(int i = 0; i < obj.length; i++){  
	            //声明一个标记，并每次重置  
	            boolean isTrue = true;  
	            //内层循环将原数组的元素逐个对比  
	            for(int j=i+1;j<obj.length;j++){  
	                //如果发现有重复元素，改变标记状态并结束当次内层循环  
	                if(obj[i]==obj[j]){  
	                    isTrue = false;  
	                    break;  
	                }  
	            }  
	            //判断标记是否被改变，如果没被改变就是没有重复元素  
	            if(isTrue){  
	                //没有元素就将原数组的元素赋给临时数组  
	               obj2[t] = obj[i];  
	                //走到这里证明当前元素没有重复，那么记录自增  
	                t++;  
	            }  
	        }  
	        //声明需要返回的数组，这个才是去重后的数组  
	        Object[]  newobj = new Object[t];  
	        //用objaycopy方法将刚才去重的数组拷贝到新数组并返回  
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
