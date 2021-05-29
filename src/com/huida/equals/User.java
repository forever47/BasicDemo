package com.huida.equals;

public class User {
	/**
	 * ����equals����
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
			             //�����ͬһ�����󷵻�true����֮����false  
			          if(this == obj){  
		                return true;  
			             }  
			              
		            //�ж��Ƿ�������ͬ  
			            if(this.getClass() != obj.getClass()){  
			                 return false;  
		             }  
			               
			            User user = (User)obj;  
		         return name.equals(user.name) && age==user.age;  
	}


}
