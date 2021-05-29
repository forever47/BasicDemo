package com.huida.foundation;
/**
 * 步骤
 * 输入日期birthday
 * 将输入的日期birthday格式化为birthDate
 * 获取现在时间now和输入日期birthDate之间的毫秒数time
 * 将time转换为day
 * 
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class CalculateDay {
public static void main(String[] args) {
	//类型转换对象
	//案例中将输入的String类型的日期转换成Date类型的日期
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	//获取输出内容的对象
	Scanner scanner = new Scanner(System.in);
	System.out.print("请输入你的生日, 输入格式为:yyyy-MM-dd");
	String birthday = scanner.nextLine();
	Date birthDate = null;
	try {
		birthDate = sdf.parse(birthday);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Date now = new Date();
	long time = now .getTime() - birthDate.getTime();
	long day = time/1000/60/60/24;
	System.out.println("到今天总共经历了:"+day+"天");
	scanner.close();
}
	

}

