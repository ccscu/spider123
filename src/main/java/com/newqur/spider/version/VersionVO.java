package com.newqur.spider.version;

import com.newqur.spider.vo.BaseVO;

/**
 * 版本更新提示,用于当前发布的系统，检测到有新版本时，会在总管理后台提示新版本
 * @author freesaas
 *
 */
public class VersionVO extends BaseVO {
	/**
	 * 发现有新版本
	 */
	private boolean findNewVersion;
	/**
	 * 新版本的版本号，不包含前面的v，如 3.7.1.20180121
	 */
	private String newVersion;
	/**
	 * 预览的url，弹出提示框后，点击查看新版本时，跳转到的网址
	 */
	private String previewUrl;
	
	public VersionVO() {
		findNewVersion = false;
	}
	
	public boolean isFindNewVersion() {
		return findNewVersion;
	}
	public void setFindNewVersion(boolean findNewVersion) {
		this.findNewVersion = findNewVersion;
	}
	public String getNewVersion() {
		return newVersion;
	}
	public void setNewVersion(String newVersion) {
		this.newVersion = newVersion;
	}
	public String getPreviewUrl() {
		return previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}
	@Override
	public String toString() {
		return "VersionVO [findNewVersion=" + findNewVersion + ", newVersion="
				+ newVersion + ", previewUrl=" + previewUrl + "]";
	}
	
}
