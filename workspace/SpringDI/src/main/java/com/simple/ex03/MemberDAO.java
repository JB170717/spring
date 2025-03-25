package com.simple.ex03;

public class MemberDAO {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public String toString() {
		return "MemberDAO [dataSource=" + dataSource + "]";
	}
	
	

	
	
	
	
}
