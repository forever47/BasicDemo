package com.huida.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * main方法调用包含异常处理的方法时候
 * 运行提示：
 * 在类中找不到 main 方法, 请将 main 方法定义为:public static void main(String[] args)否则 JavaFX 应用程序类必须扩展javafx.ap
 * 解决这个问题可以点开eclipse ->window->preference->run and debug->Lunching 
 * 改为Always
 * @author Thinkpad T450
 *
 */
public class TestDate {
	public static void main(String[] args) {
			testDemo();
	}
	public static void testDemo() {
		String validatetime = "20190715";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date now = null;
		try {
			now = sdf.parse(validatetime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		System.out.println(sdf.format(calendar.getTime()));
		calendar.add(Calendar.MONTH, 2);
		System.out.println(sdf.format(calendar.getTime()));
	}
}
