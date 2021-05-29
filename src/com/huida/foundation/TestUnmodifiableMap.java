package com.huida.foundation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 怎么确保一个集合不能被修改？
 * @author WYN
 *
 */
public class TestUnmodifiableMap {
	public static void main(String[] args) {
		//案例一
		//定义map
	 Map<Integer, String> map = new HashMap<Integer,String>();
		    map.put(1, "one");
		    map.put(2, "two");
		    System.out.println(map.toString());
		    map.put(1, "seven");
		    System.out.println();
		    System.out.println(map.toString());
		    //添加Collection接口的辅助类/工具类的unmodifiableMap方法
		    /**
		     * 添加map类的unmodifiableMap方法后
		     * 无法修改键值
		     * 无法添加新键
		     */
		    map  = Collections.unmodifiableMap(map);
//		    map.put(1, "nine");
//		    System.out.println(map.toString());
		    map.put(3, "Marvel");
		    System.out.println(map.toString());
	}
}
