package com.huida.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * main�������ð����쳣����ķ���ʱ��
 * ������ʾ��
 * �������Ҳ��� main ����, �뽫 main ��������Ϊ:public static void main(String[] args)���� JavaFX Ӧ�ó����������չjavafx.ap
 * ������������Ե㿪eclipse ->window->preference->run and debug->Lunching 
 * ��ΪAlways
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
