package com.simple.command;

import java.util.ArrayList;

public class MemberVO {

	private String id;
	private String pw;
	private String name;
	private ArrayList<String> inter;
	private String nick;
	private String birth;
	
	public MemberVO(String id, String pw, String name, ArrayList<String> inter, String nick, String birth) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.inter = inter;
		this.nick = nick;
		this.birth = birth;
	}

	public MemberVO() {		
	}
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", inter=" + inter + ", nick=" + nick
				+ ", birth=" + birth + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getInter() {
		return inter;
	}
	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	

}
