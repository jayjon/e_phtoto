package com.fsq.beans;

public class Photo {

	private int id = 0;
	private String name;
	private String path = "";
	private int dianji ;
	private String contentTime = "";
	private String shuoming;
	private int lid;	
	private int count;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getDianji() {
		return dianji;
	}
	public void setDianji(int dianji) {
		this.dianji = dianji;
	}
	public String getContentTime() {
		return contentTime;
	}
	public void setContentTime(String contentTime) {
		this.contentTime = contentTime;
	}
	public String getShuoming() {
		return shuoming;
	}
	public void setShuoming(String shuoming) {
		this.shuoming = shuoming;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}