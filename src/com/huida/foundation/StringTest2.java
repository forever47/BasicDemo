package com.huida.foundation;
public class StringTest2 {
	public static void main(String[] args) {
		//System.out.println(getSql("1479"));//201905211479
		System.out.println(getSql("ȫ��"));
	}
	public static String getSql(String classname){
		String sql="2019";
		sql=preparedSql(classname,sql);
		return sql;
	}
	public static String preparedSql(String classname,String sql) {
		if ("ȫ��".equals(classname)) {
		}else{
			sql+="0521"+classname;
		}
		return sql;
	}
}
