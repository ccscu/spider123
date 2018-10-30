package com.newqur.spider;

import com.newqur.spider.ui.MainUI;
import com.newqur.spider.util.StringUtil;
import com.newqur.spider.ui.Log;

/**
 * 数据缓存
 */
public class Global {
	public static MainUI mainUI;
	static{
		mainUI = new MainUI();
	}

	/**
	 * 软件打开后，自动将此文字赋予URL文本框内
	 */
	public static final String TEXTAREA_REMIND = "请将要抓取的目标url地址(网址)复制到此处。"
			+ "\n注意事项："
			+ "\n1.如果有多个url，每个url一行"
			+ "\n2.url必须是绝对路径";
	private static String localTemplatePath;
    /**
     * 当前提取的网站模版的域名
     */
	public static String templateDomain;
	/**
	 * 获取当前应用的目录所在。返回如 /D:/workspace/workspace_prj/webpuller/target/classes/null/
	 */
	public static String getLocalTemplatePath(){
		if(localTemplatePath == null){
			localTemplatePath = Global.class.getResource("/").getPath();
			if(localTemplatePath.indexOf("%") > -1){
				//判断路径中是否有URL编码，若有，进行转码为正常汉字
				localTemplatePath = StringUtil.urlToString(localTemplatePath);
			}
		}
		return localTemplatePath+templateDomain + "/";
	}
	
	public static void main(String[] args) {
		System.out.println(getLocalTemplatePath());
	}
	
	
	public static Log logUI;
	/**
	 * 写出日志
	 * @param text
	 */
	public static void log(String text){
		if(logUI == null){
			logUI = new Log();
			logUI.setTitle("运行日志");
		}
		System.out.println("log--"+text);
		logUI.appendLineForLastAndPositionLast(text);
	}
}
