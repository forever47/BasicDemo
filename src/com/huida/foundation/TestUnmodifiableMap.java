package com.huida.foundation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * ��ôȷ��һ�����ϲ��ܱ��޸ģ�
 * @author WYN
 *
 */
public class TestUnmodifiableMap {
	public static void main(String[] args) {
		//����һ
		//����map
	 Map<Integer, String> map = new HashMap<Integer,String>();
		    map.put(1, "one");
		    map.put(2, "two");
		    System.out.println(map.toString());
		    map.put(1, "seven");
		    System.out.println();
		    System.out.println(map.toString());
		    //���Collection�ӿڵĸ�����/�������unmodifiableMap����
		    /**
		     * ���map���unmodifiableMap������
		     * �޷��޸ļ�ֵ
		     * �޷�����¼�
		     */
		    map  = Collections.unmodifiableMap(map);
//		    map.put(1, "nine");
//		    System.out.println(map.toString());
		    map.put(3, "Marvel");
		    System.out.println(map.toString());
	}
}
