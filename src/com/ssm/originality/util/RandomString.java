package com.ssm.originality.util;

import java.util.Random;

public class RandomString {
     /**
      * 随机生成以jx_为前缀的9个字符串
      * @return  String
      */
	public static String getString(){
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    //控制在6个字符
	    for (int i = 0; i < 6; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    String name="jx_"+sb.toString();
	    return name;     
	}

}
