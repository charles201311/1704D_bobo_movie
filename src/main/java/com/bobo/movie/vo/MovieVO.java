package com.bobo.movie.vo;

import java.io.Serializable;

import com.bobo.movie.domain.Movie;

public class MovieVO extends Movie implements Serializable {
	
	
	private String uptimeStart;
	private String uptimeEnd;
	private String durationStart;//时间长度
	private String durationEnd;
	private String priceStart;
	private String priceEnd;
	
	private String orderByColumn;//排序的字段
	private String orderByMethod;//排序方式
	
	
	
	public String getOrderByColumn() {
		return orderByColumn;
	}
	public void setOrderByColumn(String orderByColumn) {
		this.orderByColumn = orderByColumn;
	}
	public String getOrderByMethod() {
		return orderByMethod;
	}
	public void setOrderByMethod(String orderByMethod) {
		this.orderByMethod = orderByMethod;
	}
	public String getUptimeStart() {
		return uptimeStart;
	}
	public void setUptimeStart(String uptimeStart) {
		this.uptimeStart = uptimeStart;
	}
	public String getUptimeEnd() {
		return uptimeEnd;
	}
	public void setUptimeEnd(String uptimeEnd) {
		this.uptimeEnd = uptimeEnd;
	}
	public String getDurationStart() {
		return durationStart;
	}
	public void setDurationStart(String durationStart) {
		this.durationStart = durationStart;
	}
	public String getDurationEnd() {
		return durationEnd;
	}
	public void setDurationEnd(String durationEnd) {
		this.durationEnd = durationEnd;
	}
	public String getPriceStart() {
		return priceStart;
	}
	public void setPriceStart(String priceStart) {
		this.priceStart = priceStart;
	}
	public String getPriceEnd() {
		return priceEnd;
	}
	public void setPriceEnd(String priceEnd) {
		this.priceEnd = priceEnd;
	}
	
	
	

}
