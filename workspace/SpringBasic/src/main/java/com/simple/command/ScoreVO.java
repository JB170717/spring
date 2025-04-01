package com.simple.command;

public class ScoreVO {

	private int sno;
	private String name;
	private String kor;
	private String eng;
	private String math;
	
	@Override
	public String toString() {
		return "ScoreVO [sno=" + sno + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

	public ScoreVO() {
	}

	public ScoreVO(int sno, String name, String kor, String eng, String math) {
		super();
		this.sno = sno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}
	
	
	
}
