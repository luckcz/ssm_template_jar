package com.kaicom.pojo;

public class Bullde {
	private Integer type ;
	private Integer count ;
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Bullde [type=" + type + ", count=" + count + "]";
	}
}
