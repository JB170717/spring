package com.simple.ex03;

public class DataSource {

	private String url;
	private String uid;
	private String upw;


	@Override
	public String toString() {
		return "DataSource [url=" + url + ", uid=" + uid + ", upw=" + upw + "]";
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	
	
}
