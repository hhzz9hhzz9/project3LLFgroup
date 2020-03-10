package com.woniu.pojo;

import java.util.List;

public class PageBean<T> {
	//当前页
	private Integer nowPage;
	//每页行数
	private Integer pageRow;
	//总行数
	private Integer countRow;
	//总页数
	private Integer countPage;
	private List<T> list;
	
	public PageBean() {
		super();
	}
	public PageBean(Integer nowPage, Integer pageRow, Integer countRow, Integer countPage, List<T> list) {
		super();
		this.nowPage = nowPage;
		this.pageRow = pageRow;
		this.countRow = countRow;
		this.countPage = countPage;
		this.list = list;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public Integer getNowPage() {
		return nowPage;
	}
	public void setNowPage(Integer nowPage) {
		this.nowPage = nowPage;
	}
	public Integer getPageRow() {
		return pageRow;
	}
	public void setPageRow(Integer pageRow) {
		this.pageRow = pageRow;
	}
	public Integer getCountRow() {
		return countRow;
	}
	public void setCountRow(Integer countRow) {
		this.countRow = countRow;
	}
	public Integer getCountPage() {
		return countPage;
	}
	public void setCountPage(Integer countPage) {
		this.countPage = countPage;
	}
	@Override
	public String toString() {
		return "PageBean [nowPage=" + nowPage + ", pageRow=" + pageRow + ", countRow=" + countRow + ", countPage="
				+ countPage + ", list=" + list + "]";
	}
	
}
