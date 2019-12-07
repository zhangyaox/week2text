package com.zhangyaoxing.util.text;

import java.util.Calendar;

import org.junit.Test;

import com.zhangyaoxing.util.Dateutil;
import com.zhangyaoxing.util.StringUtil;

public class StringText {
	//hasText(String txt)方法、isNumber(String txt)方法和getAge(Date birthday)
	@Test
	public void testHastext() {//非空
		boolean hasText = StringUtil.hasText("11");
		System.out.println(hasText);
	}
	@Test
	public void testIsNumber() {//是否是数值
		boolean hasText = StringUtil.isNumber("-1");
		System.out.println(hasText);
	}
	@Test
	public void testGetAge() {//计算年龄 1997-08-02
		Calendar instance = Calendar.getInstance();
		instance.set(1997, 7, 2);
		int age = Dateutil.getAge(instance.getTime());
		System.out.println(age);
	}
}
