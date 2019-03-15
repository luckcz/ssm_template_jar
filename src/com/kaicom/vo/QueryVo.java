package com.kaicom.vo;

import java.util.List;

import com.kaicom.pojo.Bullde;

public class QueryVo {
	private List<Bullde> list ;

	public List<Bullde> getList() {
		return list;
	}

	public void setList(List<Bullde> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "QueryVo [list=" + list + "]";
	}
	
}
