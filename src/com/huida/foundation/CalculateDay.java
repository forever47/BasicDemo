package com.huida.foundation;
/**
 * ����
 * ��������birthday
 * �����������birthday��ʽ��ΪbirthDate
 * ��ȡ����ʱ��now����������birthDate֮��ĺ�����time
 * ��timeת��Ϊday
 * 
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class CalculateDay {
public static void main(String[] args) {
	//����ת������
	//�����н������String���͵�����ת����Date���͵�����
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	//��ȡ������ݵĶ���
	Scanner scanner = new Scanner(System.in);
	System.out.print("�������������, �����ʽΪ:yyyy-MM-dd");
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
	System.out.println("�������ܹ�������:"+day+"��");
	scanner.close();
}
	

}

