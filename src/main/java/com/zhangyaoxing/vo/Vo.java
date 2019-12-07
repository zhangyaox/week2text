package com.zhangyaoxing.vo;

public class Vo {
	private Integer beginprice;
	private Integer endprice;
	
	private Integer beginsales;
	private Integer endsales;
	
	private String sortingtype;
	private String sort;
	public Vo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vo(Integer beginprice, Integer endprice, Integer beginsales, Integer endsales, String sortingtype,
			String sort) {
		super();
		this.beginprice = beginprice;
		this.endprice = endprice;
		this.beginsales = beginsales;
		this.endsales = endsales;
		this.sortingtype = sortingtype;
		this.sort = sort;
	}
	public Integer getBeginprice() {
		return beginprice;
	}
	public void setBeginprice(Integer beginprice) {
		this.beginprice = beginprice;
	}
	public Integer getEndprice() {
		return endprice;
	}
	public void setEndprice(Integer endprice) {
		this.endprice = endprice;
	}
	public Integer getBeginsales() {
		return beginsales;
	}
	public void setBeginsales(Integer beginsales) {
		this.beginsales = beginsales;
	}
	public Integer getEndsales() {
		return endsales;
	}
	public void setEndsales(Integer endsales) {
		this.endsales = endsales;
	}
	public String getSortingtype() {
		return sortingtype;
	}
	public void setSortingtype(String sortingtype) {
		this.sortingtype = sortingtype;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
}
