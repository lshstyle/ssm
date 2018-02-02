package com.demo.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StrUtils {

	public static String Md5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		MessageDigest Md5 = MessageDigest.getInstance("Md5");
		byte[] bytes = Md5.digest(str.getBytes("utf-8"));
		int value = 0;
		StringBuffer buf = new StringBuffer("");
        for (byte b : bytes) {
            value = b;
            if (value < 0)
                 value += 256;
             if (value < 16)
                 buf.append("0");
             buf.append(Integer.toHexString(value));
         }
		return buf.toString();
	}
}
