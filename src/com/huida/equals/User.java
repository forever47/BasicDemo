package com.huida.equals;

public class User {
	/**
	 * 覆盖equals方法
	 */
	int age;
	String name;
	public User(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		  if(obj == null){  
		                return false;  
			           }  	            
			             //如果是同一个对象返回true，反之返回false  
			          if(this == obj){  
		                return true;  
			             }  
			              
		            //判断是否类型相同  
			            if(this.getClass() != obj.getClass()){  
			                 return false;  
		             }  
			               
			            User user = (User)obj;  
		         return name.equals(user.name) && age==user.age;  
	}


}
