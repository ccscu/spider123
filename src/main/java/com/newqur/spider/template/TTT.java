package com.newqur.spider.template;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TTT {
	public static void main(String[] args) {
		
		String html = "<div><h1 class=\"123\">?哈哈</h1></div>";
		Document doc = Jsoup.parse(html);
		Element ele = doc.getElementsByTag("div").first();
		Element h1 = ele.getElementsByTag("h1").first();
//		h1.remove();
//		h1.before("123");
		h1.before("<h1>111</h1>");
		h1.after("<h3>222</h3>");
		
		String s = com.newqur.spider.util.StringUtil.subStringReplace(doc.toString(), "<h1>111</h1>", "<h3>222</h3>", "{include=123}");
		System.out.println(com.newqur.spider.util.StringUtil.StringToUtf8(s));
		
	}
	
	public static String unicodeToString(String str) {  
		  
	    Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");  
	    Matcher matcher = pattern.matcher(str);  
	    char ch;  
	    while (matcher.find()) {  
	        //group 6728  
	        String group = matcher.group(2);  
	        //ch:'木' 26408  
	        ch = (char) Integer.parseInt(group, 16);  
	        //group1 \u6728  
	        String group1 = matcher.group(1);  
	        str = str.replace(group1, ch + "");  
	    }  
	    return str;  
	}  
	
}
