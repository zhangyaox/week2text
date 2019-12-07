package com.zhangyaoxing.util.text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.junit.Test;

import com.zhangyaoxing.entity.Goods;
import com.zhangyaoxing.util.StringUtil;

public class Iofile {
	@Test
	public void readLinIo() throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/date.txt")));
		String readLine = bufferedReader.readLine();
		ArrayList<String> arrayList = new ArrayList<String>();
		ArrayList<Goods> arrayList2 = new ArrayList<Goods>();
		while(readLine!=null) {
			arrayList.add(readLine);
			readLine = bufferedReader.readLine();
		}
		for (String string : arrayList) {
			Goods goods = new Goods();
			String[] split = string.split("==");
//				a)	ID值要使用isNumber()工具方法判断是不是数字。（2分）
				boolean number = StringUtil.isNumber(split[0]);
				if(number) {
					goods.setId(Integer.valueOf(split[0]));
				}
//				b)	商品名称要使用hasText()方法判断有没有值。（2分）
				boolean hasText = StringUtil.hasText(split[1]);
				if(hasText) {
					goods.setName(split[1]);
				}
//				c)	价格要使用hasText()方法判断有没有值，并使用isNumber()判断是不是数字（不是数字的可以手工处理好再解析）。然后去掉“¥”符号，再转成数字。（4分）
				String substring = split[2].substring(1,split[2].length());
				boolean hasText2 = StringUtil.hasText(substring);
				boolean number2 = StringUtil.isNumber(substring);
				if(number2&&hasText2) {
					goods.setPrice(Double.valueOf(substring));
				}
				System.out.println(substring);
//				d)	百分比使用hasText()方法判断有没有值，如果没值则默认为0，并使用isNumber()判断是不是数字。然后去掉“%”符号，再转成数字。（4分）
				if(split.length==4) {
					String substring2 = split[3].substring(0,split[3].length()-1);
					if(StringUtil.isNumber(substring2)) {
						goods.setSales(Integer.valueOf(substring2));
					}
				}else {
					goods.setSales(0);
				}
				
//				e)	将每行数据解析到Goods类中，然后通过MyBatis保存到数据库。总共106条数据，少1行扣2分，最多扣20分。（6分）
				arrayList2.add(goods);
		}
		
		
	}
}
