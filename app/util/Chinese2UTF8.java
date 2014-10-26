package util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Chinese2UTF8 {

	public static void main(String[] args) {
		String strIn = "愛";
		String strMid;
		String strResult;
		try {
			strMid = new String(strIn.toString().getBytes("utf-8"));
			System.out.println(strMid);
			strResult = URLEncoder.encode(strMid, "utf-8");
			//爱 %E9%90%96%EF%BF%BD
			//愛 %E9%8E%B0%EF%BF%BD
			
			System.out.println(strResult);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String tranToUTF8(String ins) {
		
		String strMid;
		String strResult;
		try {
			strMid = new String(ins.toString().getBytes("utf-8"));
//			System.out.println(strMid);
			strResult = URLEncoder.encode(strMid, "utf-8");
			//爱 %E9%90%96%EF%BF%BD
			//愛 %E9%8E%B0%EF%BF%BD
			
//			System.out.println(strResult);
			return strResult;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
}
